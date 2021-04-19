package com.xworkz.waterfall.statetester;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.waterfall.dao.StateDAO;
import com.xworkz.waterfall.dao.StateDAOImpl;
import com.xworkz.waterfall.entity.StateEntity;

public class ListTester {

	public static void main(String[] args) {
		StateEntity entity=new StateEntity("Andhra pradesh", "Telugu", 13, 7);
		StateEntity entity1=new StateEntity("Karnataka", "Kannada", 31, 6);
		StateEntity entity2=new StateEntity("Kerala", "Malayalam", 14, 7);
		StateEntity entity3=new StateEntity("Maharastra", "Marati", 36, 8);
		StateEntity entity4=new StateEntity("Gujarat", "gujrathi", 33, 5);
		
		List<StateEntity> list= new ArrayList<StateEntity>();
		list.add(entity);
		list.add(entity1);
		list.add(entity2);
		list.add(entity3);
		list.add(entity4);
		
		StateDAO dao=new StateDAOImpl();
		dao.create(list);
	}

}
