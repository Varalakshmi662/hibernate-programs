package com.xworkz.waterfall.statetester;

import com.xworkz.waterfall.dao.StateDAO;
import com.xworkz.waterfall.dao.StateDAOImpl;
import com.xworkz.waterfall.entity.StateEntity;
import com.xworkz.waterfall.entity.WaterFallsEntity;

public class createTester {

	public static void main(String[] args) {
		StateEntity entity=new StateEntity("Andhra Pradesh", "Telugu", 29, 56);
		WaterFallsEntity entity1=new WaterFallsEntity();
		entity1.setName("kunjikal falls");
		entity1.setDepth(566);
		entity1.setDestination("Indian Ocean");
		entity1.setElectricityGenerated(false);
		entity1.setEntryFees(200);
		entity1.setHeight(184);
		entity1.setLocation("Shivamogha");
		entity1.setNoOfDeaths(10);
		entity1.setNoOfVisitors(30000);
		entity1.setRating(4);
		entity1.setSourceRiver("Thunga");
		StateDAO dao= new StateDAOImpl();
		dao.create(entity, entity1);
	}

}
