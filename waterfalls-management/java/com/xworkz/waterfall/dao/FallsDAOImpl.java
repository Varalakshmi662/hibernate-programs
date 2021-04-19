package com.xworkz.waterfall.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.xworkz.waterfall.entity.WaterFallsEntity;
import com.xworkz.waterfall.util.SFUtil;

public class FallsDAOImpl implements FallsDAO {
	public SessionFactory factory = SFUtil.getFactory();

	@Override
	public void create(WaterFallsEntity entity) {
		System.out.println("created create");
		System.out.println("entity" + entity);
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			session.save(entity);
			transaction.commit();
			System.out.println("created entity sucessfully");
		}
	}

	@Override
	public WaterFallsEntity updateHeightAndDepthById(int id, double height, double depth) {
		System.out.println("invoking update");
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			WaterFallsEntity entity = session.get(WaterFallsEntity.class, id);
			if (entity != null) {
				System.out.println("can upadte entity");
				entity.setHeight(height);
				entity.setDepth(depth);
				session.update(entity);
				transaction.commit();
			} else {
				System.out.println("canot update");
			}
			return entity;
		}

	}

	@Override
	public WaterFallsEntity getById(int id) {
		System.out.println("invoking getByid");
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			WaterFallsEntity entity = session.get(WaterFallsEntity.class, id);
			transaction.commit();
			return entity;
		}
	}

	@Override
	public void deleteById(int id) {
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			WaterFallsEntity entity = session.get(WaterFallsEntity.class, id);
			if (entity != null) {
				System.out.println("can delete entity");
				session.delete(entity);
				transaction.commit();
				System.out.println("entity" + entity);
			} else {
				System.out.println("cannot delete");
			}
		}
	}
}