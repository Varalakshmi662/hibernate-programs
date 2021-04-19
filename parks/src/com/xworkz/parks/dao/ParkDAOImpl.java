package com.xworkz.parks.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.xworkz.parks.entity.ParkEntity;
import com.xworkz.parks.util.SFUtil;

public class ParkDAOImpl implements ParkDAO {
	public SessionFactory factory = SFUtil.getFactory();

	@Override
	public void save(ParkEntity entity) {
		System.out.println("create save method");
		System.out.println("entity" + entity);
		try (Session session = factory.openSession()) {
			Transaction trans = session.beginTransaction();
			session.save(entity);
			trans.commit();
			System.out.println("create sucessfully");
		}
	}

	@Override
	public ParkEntity getById(int id) {
		System.out.println("invoking get by id");
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			ParkEntity entity = session.get(ParkEntity.class, id);
			transaction.commit();
			return entity;
		}
	}

	@Override
	public ParkEntity updatelocationAndDimensionById(String location, int dimension, int id) {
		System.out.println("invoking update");
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			ParkEntity entity = session.get(ParkEntity.class, id);
			if (entity != null) {
				System.out.println("can update entity");
				entity.setLocation(location);
				entity.setDimensions(dimension);
				session.update(entity);
				transaction.commit();
			} else {
				System.out.println("cannot update");
			}
			return entity;
		}
	}

	@Override
	public void deleteById(int id) {
		System.out.println("invoking delete");
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			ParkEntity entity = session.get(ParkEntity.class, id);
			if (entity != null) {
				System.out.println("can update entity");
				session.delete(entity);
				transaction.commit();
			} else {
				System.out.println("cannot update");
			}
		}
	}

	@Override
	public void create(List<ParkEntity> entities) {
		System.out.println("invoking create list");
		Session session=this.factory.openSession();
		Transaction transaction=session.beginTransaction();
		for (ParkEntity parkEntity : entities) {
			session.save(parkEntity);
		}
		transaction.commit();
		session.close();
	}
}