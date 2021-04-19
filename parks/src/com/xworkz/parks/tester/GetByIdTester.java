package com.xworkz.parks.tester;

import com.xworkz.parks.dao.ParkDAOImpl;
import com.xworkz.parks.entity.ParkEntity;

public class GetByIdTester {

	public static void main(String[] args) {
		ParkEntity entity=new ParkDAOImpl().getById(1);
		System.out.println(entity);
	}

}
