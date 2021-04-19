package com.xworkz.waterfall.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.waterfall.entity.StateEntity;
import com.xworkz.waterfall.entity.WaterFallsEntity;
import com.xworkz.waterfall.util.SFUtil;

public class StateDAOImpl implements StateDAO {
 private SessionFactory factory=SFUtil.getFactory();
	@Override
	public void create(StateEntity entity) {
		System.out.println("invoking create");
		System.out.println("entity"+entity);
		try(Session session=factory.openSession()){
			Transaction transaction = session.beginTransaction();
			session.save(entity);
			transaction.commit();
			System.out.println("created entity sucessfully");
		}
	}

	@Override
	public void create(List<StateEntity> entities) {
		Session session=this.factory.openSession();
		Transaction transaction=session.beginTransaction();
		for (StateEntity stateEntity : entities) {
			session.save(stateEntity);
		}
		transaction.commit();
		session.close();
	}

	@Override
	public void create(StateEntity stateEntity, WaterFallsEntity entity) {
		Transaction transaction=null;
		System.out.println("invoking create");
		System.out.println("entity"+entity);
		System.out.println("entity"+stateEntity);
		try (Session session=this.factory.openSession()){
			 transaction=session.beginTransaction();
			session.save(entity);
			session.flush();
			session.save(stateEntity);
			transaction.commit();
		}catch (HibernateException e) {
			e.printStackTrace();
			transaction.rollback();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
