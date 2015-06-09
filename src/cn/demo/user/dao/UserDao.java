package cn.demo.user.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;
import org.springframework.stereotype.Component;

import cn.demo.user.model.User;
import cn.utils.HibernateUtil;

@Component
public class UserDao {

	@Test
	public void AddUser(){
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
}
