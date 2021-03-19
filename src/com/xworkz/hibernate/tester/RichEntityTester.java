package com.xworkz.hibernate.tester;

import com.xworkz.hibernate.dao.RichDAO;
import com.xworkz.hibernate.dao.RichDAOImpl;
import com.xworkz.hibernate.dto.RichEntity;

public class RichEntityTester {
	
	public static void main(String[] args) {
		RichEntity entity=new RichEntity();
		entity.setId(1);
		entity.setName("vara");
		entity.setNetWorthInBillion(1832);
		entity.setMarried(false);
		entity.setCountry("INDIA");
		entity.setBussiness("Event management");
		entity.setRank(1);
	
	RichDAO dao=new RichDAOImpl();
	dao.create(entity);
	
	}

}
