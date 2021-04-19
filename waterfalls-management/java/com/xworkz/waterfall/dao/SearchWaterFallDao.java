package com.xworkz.waterfall.dao;

public interface SearchWaterFallDao extends FallsDAO{

	public String findLocationByName(String name);
	
	public int findNoOfDeathsByLocationAndName(String loc, String name);
	
	public Object[] findNoOfDeathsAndDestinationBylocationAndName(String loc,String Name);
}
