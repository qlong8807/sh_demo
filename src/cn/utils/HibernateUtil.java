package cn.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {
	private static SessionFactory factory;

	static {
		try {
			// 读取hibernate.cfg.xml文件
			Configuration cfg = new Configuration().configure();
			// 建立SessionFactory
//			factory = cfg.buildSessionFactory(); 4.0已经不建议使用

			ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
			factory = cfg.buildSessionFactory(serviceRegistry);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 获得开启着的Session
	public static Session getSession() {
		return factory.openSession();
	}

	// 关闭Session
	public static void closeSession(Session session) {
		if (session != null) {
			if (session.isOpen()) {
				session.close();
			}
		}
	}

	public static SessionFactory getSessionFactory() {
		return factory;
	}
}