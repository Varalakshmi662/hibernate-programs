package com.xworkz.waterfall.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.xworkz.waterfall.util.SFUtil;

public class SearchWaterfallDAOImpl extends FallsDAOImpl implements SearchWaterFallDao {
	private SessionFactory factory = SFUtil.getFactory();

	@Override
	public String findLocationByName(String name) {
		try (Session session = factory.openSession()) {
			String hql = "select waterfall.location from WaterFallsEntity waterfall where waterfall.name=:nm";
			Query<String> query = session.createQuery(hql);
			query.setParameter("nm", name);
			String location = query.uniqueResult();
			return location;
		}
	}

	@Override
	public int findNoOfDeathsByLocationAndName(String loc, String name) {
		try (Session session = factory.openSession()) {
			String hql = "select waterfall.noOfDeaths from WaterFallsEntity waterfall where waterfall.name=:nm and waterfall.location=:lc";
			Query<Integer> query = session.createQuery(hql);
			query.setParameter("nm", name);
			query.setParameter("lc", loc);
			Integer deaths = query.uniqueResult();
			return deaths;
		}
	}

	@Override
	public Object[] findNoOfDeathsAndDestinationBylocationAndName(String loc, String Name) {
		try (Session session = factory.openSession()) {
			String hql = "select waterfall.noOfDeaths, waterfall.destination from WaterFallsEntity waterfall where waterfall.name=:nm and waterfall.location=:lc";
			Query<Object[]> query = session.createQuery(hql);
			query.setParameter("nm", Name);
			query.setParameter("lc", loc);
			 return query.uniqueResult();
			}
}
}