package com.xworkz.waterfall.dao;

import com.xworkz.waterfall.entity.WaterFallsEntity;

public interface FallsDAO {
	public void create(WaterFallsEntity entity);
	
	public WaterFallsEntity updateHeightAndDepthById(int id, double height, double depth);
	
	public WaterFallsEntity getById(int id);
	
	public void deleteById(int id);
	
}
