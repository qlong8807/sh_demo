package cn.demo.user.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.Test;

import cn.demo.user.model.Dept;
import cn.demo.user.model.User;
import cn.utils.HibernateUtil;

//@Component
public class TestHibernate {

	@Test
	public void addUser(){
		User user = new User();
		user.setId(5);
		user.setName("zhang");
		user.setPassword("zhang");
		user.setAge(21);
		Session session = HibernateUtil.getSession();
		Transaction transaction = session.beginTransaction();
		session.save(user);
		transaction.commit();
	}
	@Test
	public void addDept(){
		User user = new User();
		user.setId(6);
		user.setName("zhang");
		user.setPassword("zhang");
		user.setAge(21);
		Dept dept = new Dept();
		dept.setId(1);
		dept.setName("depa1");
		dept.getUsers().add(user);
		Session session = HibernateUtil.getSession();
		Transaction transaction = session.beginTransaction();
		session.save(user);
		transaction.commit();
	}
	
	@Test
	public void getUser(){
		Session session = HibernateUtil.getSession();
		User user = (User) session.get(User.class, 1);
		System.out.println(0000);
		System.out.println(user.getName());
	}
	@Test
	public void loadUser(){
		Session session = HibernateUtil.getSession();
		User user = (User) session.load(User.class, 1);
		System.err.println(0000);
		System.out.println(user.getName());
	}
	@Test
	public void loadDept(){
		Session session = HibernateUtil.getSession();
		Dept dept = (Dept) session.load(Dept.class, 1);
		System.out.println(dept.toString());
	}
	
	@Test
	public void generateTable(){
		SchemaExport export = new SchemaExport(new Configuration().configure());  
        // 第一个参数表示是否在控制台打印出DDL语句(print the DDL to the console)  
        // 第二个参数表示是否将脚本输出到数据库(export the script to the database)  
        export.create(true, true);  
	}
	
}
