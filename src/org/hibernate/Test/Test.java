package org.hibernate.Test;

import org.hibernate.Session;
import org.hibernate.User.Address;
import org.hibernate.User.HiberateUtil;
import org.hibernate.User.User;
import org.hibernate.hql.ast.tree.SelectExpression;

public class Test {
	public static void main(String[] args) {
		Session session = HiberateUtil.getSession();
		session.beginTransaction();
		try {
			User user = new User();
			user.setName("Tom");
			user.setPassword("111");
			Address address = new Address();
			address.setAddressinfo("America");
			user.setAddress(address);
			address.setUser(user);
			session.save(address);
			session.save(user);
			session.getTransaction().commit();
		} catch (Exception e) {

			session.getTransaction().rollback();
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			session.close();
		}
	}

}
