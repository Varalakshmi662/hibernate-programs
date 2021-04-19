package com.xworkz.cartoon.tester;

import com.xworkz.cartoon.dao.CartoonDAO;
import com.xworkz.cartoon.dao.CartoonDAOImpl;
import com.xworkz.cartoon.entity.CartoonEntity;

public class HqlTester {

	public static void main(String[] args) {
		CartoonDAO dao=new CartoonDAOImpl();
		CartoonEntity entity = dao.findByName("Tom");
		System.out.println(entity);
		
	}

}
