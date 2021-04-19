package com.xworkz.waterfall.tester;

import com.xworkz.waterfall.dao.SearchWaterFallDao;
import com.xworkz.waterfall.dao.SearchWaterfallDAOImpl;

public class HqlTester {

	public static void main(String[] args) {
		SearchWaterFallDao dao=new SearchWaterfallDAOImpl();
		String location=dao.findLocationByName("gokakh falls");
		System.out.println(location);
		
		Integer deaths=dao.findNoOfDeathsByLocationAndName("Gokakh", "gokakh falls");
		System.out.println(deaths);
		
		Object[] entity=dao.findNoOfDeathsAndDestinationBylocationAndName("Gokakh", "gokakh falls");
		System.out.println(entity);
		System.out.println(entity[0]);
		System.out.println(entity[1]);
	}
}
