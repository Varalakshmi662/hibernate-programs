package com.xworkz.waterfall.tester;

import com.xworkz.waterfall.dao.FallsDAOImpl;
import com.xworkz.waterfall.entity.WaterFallsEntity;

public class GetByIdTester {

	public static void main(String[] args) {
	WaterFallsEntity entity=new FallsDAOImpl().getById(2);
	System.out.println(entity);
	}

}
