package com.xworkz.bbc;

import com.xworkz.bbc.dao.BBCDAO;
import com.xworkz.bbc.dao.BBCDAOImpl;
import com.xworkz.bbc.entity.BBCEntity;

public class Tester {

	public static void main(String[] args) {
		BBCEntity entity=new BBCEntity();
//		entity.setId(1);
		entity.setName("Supriya konnur");
		entity.setContestantType("Software Developer");
		entity.setGender("Female");
		entity.setSeasonId(9);
		entity.setDaysIn(100);
		entity.setNoOfTasks(100);
		BBCDAO dao=new BBCDAOImpl();
		dao.create(entity);
	}

}
