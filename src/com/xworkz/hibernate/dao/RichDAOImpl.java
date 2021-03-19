package com.xworkz.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.hibernate.dto.RichEntity;

public class RichDAOImpl implements RichDAO {

	public RichDAOImpl() {
		System.out.println("created ");
	}
	@Override
	public void create(RichEntity entity) {
	System.out.println("invoked create");
	System.out.println("ENtity"+entity);
	
	Configuration cfg=new Configuration();
	cfg.configure();
	cfg.addAnnotatedClass(RichEntity.class);
	SessionFactory factory=cfg.buildSessionFactory();
	Session session=factory.openSession();
	Transaction transaction=session.beginTransaction();
	session.save(entity);
	transaction.commit();
	session.close();
	factory.close();
		
	}

}
