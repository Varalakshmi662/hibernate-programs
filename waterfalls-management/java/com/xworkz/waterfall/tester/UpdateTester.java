package com.xworkz.waterfall.tester;

import com.xworkz.waterfall.dao.FallsDAOImpl;
import com.xworkz.waterfall.entity.WaterFallsEntity;

public class UpdateTester {

	public static void main(String[] args) {
	WaterFallsEntity entity=new FallsDAOImpl().updateHeightAndDepthById(1, 200, 7689);
	System.out.println(entity);
	}

}
