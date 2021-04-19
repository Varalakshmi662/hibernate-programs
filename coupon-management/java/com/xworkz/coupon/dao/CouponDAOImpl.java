package com.xworkz.coupon.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.coupon.entity.CouponEntity;
import com.xworkz.sfutil.util.SFUtil;

public class CouponDAOImpl implements CouponDAO {
	public SessionFactory factory = SFUtil.getFactory();

	@Override
	public void save(CouponEntity entity) {
		System.out.println("invoking save");
		System.out.println("entity" + entity);
		try (Session session = factory.openSession()) {
			Transaction trans = session.beginTransaction();
			session.save(entity);
			trans.commit();
			System.out.println("create sucessfully");
		}
	}

	@Override
	public CouponEntity getById(int id) {
		System.out.println("invoking get by id");
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			CouponEntity couponEntity = session.get(CouponEntity.class, id);
			transaction.commit();
			return couponEntity;
		}
	}

	@Override
	public CouponEntity updateNameAndCouponTypeById(String name, String type, int id) {
		System.out.println("invoking update");
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			CouponEntity entity = session.get(CouponEntity.class, id);
			if (entity != null) {
				System.out.println("can update entity");
				entity.setName(name);
				entity.setCouponType(type);
				session.update(entity);
				transaction.commit();
			} else {
				System.out.println("cannot upadte");
			}
			return entity;
		}
	}

	@Override
	public void deleteById(int id) {
		System.out.println("invoking getByid");
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			CouponEntity entity = session.get(CouponEntity.class, id);
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

	@Override
	public void create(List<CouponEntity> entities) {
		System.out.println("invoking create list");
		Session session = this.factory.openSession();
			Transaction transaction = session.beginTransaction();
			for (CouponEntity couponEntity : entities) {
				session.save(couponEntity);
			}
			transaction.commit();
			session.close();
		}
}