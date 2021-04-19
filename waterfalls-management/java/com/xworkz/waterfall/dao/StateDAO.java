package com.xworkz.waterfall.dao;

import java.util.List;

import com.xworkz.waterfall.entity.StateEntity;
import com.xworkz.waterfall.entity.WaterFallsEntity;

public interface StateDAO {

	public void create(StateEntity stateEntity, WaterFallsEntity entity);

	public void create(StateEntity entity);
	
	public void create(List<StateEntity> entities);
}
