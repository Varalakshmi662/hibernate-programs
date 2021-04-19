package com.xworkz.parks.tester;

import com.xworkz.parks.dao.ParkDAOImpl;
import com.xworkz.parks.entity.ParkEntity;

public class UpdateTester {

	public static void main(String[] args) {
		ParkEntity entity=new ParkDAOImpl().updatelocationAndDimensionById("Indiranagar", 12356, 1);
		System.out.println(entity);
	}

}
