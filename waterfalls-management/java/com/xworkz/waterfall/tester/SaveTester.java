package com.xworkz.waterfall.tester;

import com.xworkz.waterfall.dao.FallsDAO;
import com.xworkz.waterfall.dao.FallsDAOImpl;
import com.xworkz.waterfall.entity.WaterFallsEntity;

public class SaveTester {

	public static void main(String[] args) {
	
		WaterFallsEntity entity=new WaterFallsEntity();
		entity.setName("kunjikal falls");
		entity.setDepth(566);
		entity.setDestination("Indian Ocean");
		entity.setElectricityGenerated(false);
		entity.setEntryFees(200);
		entity.setHeight(184);
		entity.setLocation("Shivamogha");
		entity.setNoOfDeaths(10);
		entity.setNoOfVisitors(30000);
		entity.setRating(4);
		entity.setSourceRiver("Thunga");
		
		WaterFallsEntity entity1=new WaterFallsEntity();
		entity1.setName("gokakh falls");
		entity1.setDepth(566);
		entity1.setDestination("Pacific Ocean");
		entity1.setElectricityGenerated(false);
		entity1.setEntryFees(200);
		entity1.setHeight(184);
		entity1.setLocation("Gokakh");
		entity1.setNoOfDeaths(5);
		entity1.setNoOfVisitors(30000);
		entity1.setRating(4);
		entity1.setSourceRiver("Thunga");
		
		FallsDAO dao=new FallsDAOImpl();
		dao.create(entity);
		dao.create(entity1);
	}
}
