package com.xworkz.products.dao;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.xworkz.products.entity.ProductEntity;
import com.xworkz.products.entity.ProductEntity.ProductType;
import com.xworkz.sfutil.util.SFUtil;

public class ProductDAOImpl implements ProductDAO {
	private SessionFactory factory = SFUtil.getFactory();

	@Override
	public void persist(ProductEntity entity) {
		System.out.println("invoking persist");
		System.out.println("entity" + entity);
		Session session = null;
		try {
			session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(entity);
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	@Override
	public ProductEntity findByNameAndManufacturer(String name, String manuf) {
		System.out.println("invoking find by name and Manufacturer");
		try (Session session = factory.openSession()) {
			String hql = "select product from ProductEntity product where product.name=:nm and product.manufacturer=:manf";
			Query<ProductEntity> query = session.createQuery(hql);
			query.setParameter("nm", name);
			query.setParameter("manf", manuf);
			ProductEntity entity = query.uniqueResult();
			return entity;
		}
	}

	@Override
	public ProductEntity findByTypeAndBrandAndName(String name, String brand, ProductType type) {
		System.out.println("invoking find by type");
		try (Session session = factory.openSession()) {
			String hql = "select product from ProductEntity product where product.name=:nm and product.brand=:brnd and product.type=:tp";
			Query<ProductEntity> query = session.createQuery(hql);
			query.setParameter("nm", name);
			query.setParameter("brnd", brand);
			query.setParameter("tp", type);
			ProductEntity entity = query.uniqueResult();
			return entity;
		}
	}

	@Override
	public Double findPriceByTypeAndBrandAndName(String name, String brand, ProductType type) {
		try (Session session = factory.openSession()) {
			String hql = "select product.price from ProductEntity product where product.name=:nm and product.brand=:brnd and product.type=:tp";
			Query<Double> query = session.createQuery(hql);
			query.setParameter("nm", name);
			query.setParameter("brnd", brand);
			query.setParameter("tp", type);
			Double result = query.uniqueResult();
			return result;
		}
	}

	@Override
	public Object[] findPriceAndQuantityByTypeAndBrandAndName(String name, String brand, ProductType type) {
		try (Session session = factory.openSession()) {
			String hql = "select product.price,product.quantity from ProductEntity product where product.name=:nm and product.brand=:brnd and product.type=:tp";
			Query<Object[]> query = session.createQuery(hql);
			query.setParameter("nm", name);
			query.setParameter("brnd", brand);
			query.setParameter("tp", type);
			Object[] result = query.uniqueResult();
			return result;
		}
	}

	@Override
	public ProductEntity findByTypeAndBrandAndQuality(String name, String brand, boolean quality) {
		try (Session session = factory.openSession()) {
			String hql = "select product from ProductEntity product where product.name=:nm and product.brand=:brnd and product.quality=:qty";
			Query<ProductEntity> query = session.createQuery(hql);
			query.setParameter("nm", name);
			query.setParameter("brnd", brand);
			query.setParameter("qty", quality);
			ProductEntity result = query.uniqueResult();
			return result;
		}
	}

	@Override
	public Object[] findNameAndTypeById(int id) {
		try (Session session = factory.openSession()) {
			String hql = "select product.name,product.type from ProductEntity product where product.id=:id";
			Query<Object[]> query = session.createQuery(hql);
			query.setParameter("id", id);
			Object[] result = query.uniqueResult();
			return result;
		}

	}

	@Override
	public int findMaxId() {
		try (Session session = factory.openSession()) {
			String hql = "select max(id) from ProductEntity";
			Query<Integer> query = session.createQuery(hql);
			Integer result = query.uniqueResult();
			return result;
		}
	}

	@Override
	public long findSize() {
		try (Session session = factory.openSession()) {
			String hql = "select count(*) from ProductEntity";
			Query<Long> query = session.createQuery(hql);
			Long result = query.uniqueResult();
			return result;
		}
	}

	@Override
	public double findMaxPrice() {
		try (Session session = factory.openSession()) {
			String hql = "select max(price) from ProductEntity";
			Query<Double> query = session.createQuery(hql);
			Double result = query.uniqueResult();
			return result;
		}
	}

	@Override
	public double findSumOfPrice() {
		try (Session session = factory.openSession()) {
			String hql = "select sum(price) from ProductEntity";
			Query<Double> query = session.createQuery(hql);
			Double result = query.uniqueResult();
			return result;
		}
	}

	@Override
	public int findMinId() {
		try (Session session = factory.openSession()) {
			String hql = "select min(id) from ProductEntity";
			Query<Integer> query = session.createQuery(hql);
			Integer result = query.uniqueResult();
			return result;
		}
	}

	@Override
	public ProductEntity findDistinct() {
		try (Session session = factory.openSession()) {
			String hql = "select distinct(product) from ProductEntity product";
			Query<ProductEntity> query = session.createQuery(hql);
			ProductEntity result = query.uniqueResult();
			return result;
		}
	}

	@Override
	public void saveAll(List<ProductEntity> list) {
		System.out.println("invoking save");
		System.out.println("entity" + list);
		Session session = null;
		try {
			session = this.factory.openSession();
			int count = 0;
			Transaction transaction = session.beginTransaction();
			for (ProductEntity productEntity : list) {
				session.save(productEntity);
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
		} finally {
			session.close();
		}
	}

	@Override
	public List<ProductEntity> findAll() {
		try(Session session=factory.openSession()){
			Query<ProductEntity> query=session.createNamedQuery("findAll");
			List<ProductEntity> list=query.list();
			return list;
		}		
	}

	@Override
	public List<ProductEntity> findAllIds() {
		try(Session session=factory.openSession()){
			Query<ProductEntity>query=session.createNamedQuery("findAllIds");
			List<ProductEntity> list=query.list();
			return list;
		}
	}

	@Override
	public void updateBrandAndQuantityByName(String brand, int quantity, String name) {
		try(Session session=factory.openSession())
		{Transaction transaction=session.beginTransaction();
			Query<ProductEntity> entity=session.createNamedQuery("updateBrandAndQuantityByName");
			entity.setParameter("brand", brand);
			entity.setParameter("quantity", quantity);
			entity.setParameter("name", name);
			entity.executeUpdate();
			transaction.commit();
			}
		}

	
}