package com.revature.kyubbs.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.kyubbs.beans.User;
import com.revature.kyubbs.util.HibernateUtil;

public class UserDAOImp implements UserDAO {

	public int addUser(User user) {
		
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		
		int result = (Integer) s.save(user);
		
		tx.commit();
		s.close();
		return result;
	}

	public User getUserById(int id) {
		
		Session s = HibernateUtil.getSession();
		User user = (User) s.get(User.class, id);
		
		s.close();
		return user;
	}
	

	public User getUserByUsername(String username) {
		
		Session s = HibernateUtil.getSession();
		String hql = "FROM User WHERE username=:nameParam";
		
		Query q = s.createQuery(hql);
		q.setParameter("nameParam", username);
		
		User user = (User) q.uniqueResult();
		
		s.close();
		return user;
	}
	
	public void updateUser(User user) {
		
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		
		s.merge(user);
		
		tx.commit();
		s.close();
	}

	public void deleteBear(User user) {
		
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		
		s.delete(user);
		
		tx.commit();
		s.close();
		
	}

}
