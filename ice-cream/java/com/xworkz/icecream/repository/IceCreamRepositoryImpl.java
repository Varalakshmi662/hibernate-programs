package com.xworkz.icecream.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.HibernateException;

import com.xworkz.icecream.entity.IceCreamEntity;

public class IceCreamRepositoryImpl implements IceCreamRepository {
	//sessionFactory------EntityManagerFactory
		//session----------EntityManager
	//calling method by using class name called static 

	@Override
	public void persist(IceCreamEntity entity) {
		System.out.println("inovking persist");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager session = factory.createEntityManager();
		session.getTransaction().begin();
		session.persist(entity);
		session.getTransaction().commit();
		session.close();
		factory.close();
	}
	
	@Override
	public void persistAll(List<IceCreamEntity> list) {
		System.out.println("invoking save all");
		System.out.println("entities"+list);
		EntityManager session=null; 
		try{
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
			int count=0;
			session=factory.createEntityManager();
			session.getTransaction().begin();
			for (IceCreamEntity iceCreamEntity : list) {
				session.persist(iceCreamEntity);
				count++;
				if (count == 5) {
					session.flush();
					count = 0;
					System.out.println("flush is used");
				}
			}
				session.getTransaction().commit();
				
		}catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}finally {
			session.close();
		}
	}

	@Override
	public List<IceCreamEntity> getAll() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager session = factory.createEntityManager();
		session.getTransaction().begin();
		Query query=session.createNamedQuery("getAll");
		List<IceCreamEntity> list=query.getResultList();
		return list;
	}

	@Override
	public void updatePriceByName(String name, double price) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager session = factory.createEntityManager();
		session.getTransaction().begin();
		Query query=session.createNamedQuery("updatePriceByName");
		query.setParameter("pr", price);
		query.setParameter("nm", name);
		query.executeUpdate();
		session.getTransaction().commit();
		session.close();
		factory.close();
	}

	@Override
	public IceCreamEntity findByNameAndPrice(String name, double price) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager session = factory.createEntityManager();
		Query query=session.createNamedQuery("findByNameAndPrice");
		query.setParameter("nm", name);
		query.setParameter("pr", price);
		 IceCreamEntity result =(IceCreamEntity) query.getSingleResult();
		return result;
	}

	@Override
	public IceCreamEntity getByMaxPrice() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager session = factory.createEntityManager();
		Query query=session.createNamedQuery("getByMaxPrice");
		IceCreamEntity singleResult = (IceCreamEntity) query.getSingleResult();
		return singleResult;
	}

	@Override
	public IceCreamEntity getByMinPrice() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager session = factory.createEntityManager();
		Query query=session.createNamedQuery("getByMinPrice");
		IceCreamEntity singleResult = (IceCreamEntity) query.getSingleResult();
		return singleResult;

	}

	@Override
	public Double getBySumPrice() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager session = factory.createEntityManager();
		Query query=session.createNamedQuery("getBySumPrice");
		double singleResult =  (double) query.getSingleResult();
		return singleResult;

	}

	@Override
	public Double getPriceByName(String name) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager session = factory.createEntityManager();
		Query query=session.createNamedQuery("getPriceByName");
		query.setParameter("nm", name);
		double result =  (double) query.getSingleResult();
		return result;

	}

	@Override
	public List<Object[]> getNameAndFlavourByPrice(double price) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager session = factory.createEntityManager();
		Query query=session.createNamedQuery("getNameAndFlavourByPrice");
		query.setParameter("pr", price);
		List<Object[]> list = query.getResultList();
		return list;
	}

	@Override
	public void deleteByName(String name) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager session = factory.createEntityManager();
		session.getTransaction().begin();
		session.createNamedQuery("deleteByName").setParameter("nm", name).executeUpdate();
		session.getTransaction().commit();
		session.close();
	}

}
