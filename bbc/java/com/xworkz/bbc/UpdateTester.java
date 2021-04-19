package com.xworkz.bbc;

import com.xworkz.bbc.dao.BBCDAOImpl;
import com.xworkz.bbc.entity.BBCEntity;

public class UpdateTester {

	public static void main(String[] args) {
		BBCEntity entity=new BBCDAOImpl().updateNoOfTasksAndDysInById(2, 3, 1);
		System.out.println(entity);
	}

}
