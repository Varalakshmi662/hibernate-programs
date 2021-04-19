package com.xworkz.bbc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.bbc.entity.BBCEntity;

public class BBCDAOImpl implements BBCDAO {
	public BBCDAOImpl() {
		System.out.println("invoking default constructor");
	}

	@Override
	public void create(BBCEntity entity) {
		System.out.println("invoking create");
		System.out.println("entity"+entity);
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(BBCEntity.class);
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(entity);
		transaction.commit();
		session.close();
		factory.close();
	}

	@Override
	public BBCEntity getById(int id) {
		Configuration configuration=new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(BBCEntity.class);
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		BBCEntity entity=session.get(BBCEntity.class, id);
		transaction.commit();
		session.close();
		factory.close();
		return entity;
	}

	@Override
	public BBCEntity updateNoOfTasksAndDysInById(int id, int noOfTasks, int noOfDaysIn) {
		SessionFactory factory=new Configuration().configure().addAnnotatedClass(BBCEntity.class).buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		BBCEntity entity=session.get(BBCEntity.class, 1);
		if(entity!=null) {
			System.out.println("can update entity");
			entity.setDaysIn(noOfDaysIn);
			entity.setNoOfTasks(noOfTasks);
			session.update(entity);
			transaction.commit();
		}
		else {
			System.out.println("cannot update");
		}
		session.close();
		factory.close();
		return entity;
	}

	@Override
	public void deleteById(int id) {
		SessionFactory factory=new Configuration().configure().addAnnotatedClass(BBCEntity.class).buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		BBCEntity entity=session.get(BBCEntity.class, id);
		if(entity!=null) {
			System.out.println("can delete entity");
			session.delete(entity);
			transaction.commit();
			System.out.println("entity"+entity);
		}
		else {
			System.out.println("cannot delete");
		}
		session.close();
		factory.close();
		
	}

}
