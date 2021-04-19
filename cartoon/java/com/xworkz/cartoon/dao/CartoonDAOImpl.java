package com.xworkz.cartoon.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.xworkz.cartoon.entity.CartoonEntity;
import com.xworkz.sfutil.util.SFUtil;

public class CartoonDAOImpl implements CartoonDAO {
	public SessionFactory factory = SFUtil.getFactory();

	@Override
	public void saveAll(List<CartoonEntity> list) {
		System.out.println("invoking save");
		System.out.println("entity" + list);
		Session session = null;
		try {
			session = this.factory.openSession();
			int count = 0;
			Transaction transaction = session.beginTransaction();
			for (CartoonEntity cartoonEntity : list) {
				session.save(cartoonEntity);
				count++;
				if (count == 5) {
					session.flush();
					count = 0;
					System.out.println("flush is used");
				}
			}
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}finally {
			session.close();
		}
	}

	@Override
	public CartoonEntity findByName(String name) {
		try (Session session = this.factory.openSession()) {
			String hqlsyntax = "select cart from CartoonEntity cart where cart.name='" + name + "'";
			Query<CartoonEntity> createQuery = session.createQuery(hqlsyntax);
			CartoonEntity cartoonEntity = createQuery.uniqueResult();
			return cartoonEntity;
		}
	}
}