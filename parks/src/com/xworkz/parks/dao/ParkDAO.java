package com.xworkz.parks.dao;

import java.util.List;

import com.xworkz.parks.entity.ParkEntity;

public interface ParkDAO {

	public void save(ParkEntity entity);
	
	public ParkEntity getById(int id);
	
	public ParkEntity updatelocationAndDimensionById(String location,int dimension, int id);
	
	public void deleteById(int id);

	public void create(List<ParkEntity> entities);

}
