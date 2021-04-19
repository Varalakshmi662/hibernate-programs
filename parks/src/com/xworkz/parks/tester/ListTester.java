package com.xworkz.parks.tester;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.parks.dao.ParkDAO;
import com.xworkz.parks.dao.ParkDAOImpl;
import com.xworkz.parks.entity.ParkEntity;

public class ListTester {
	public static void main(String[] args) {
	
	ParkEntity entity=new ParkEntity("JP park", "Brudhavan Nagar", 456, 8, 50);
	ParkEntity entity1=new ParkEntity("Freedom Park", "Sheshadripuram",1246, 9, 60);
	ParkEntity entity2=new ParkEntity("jaymahal park","jaymahal", 648, 8, 40);
	ParkEntity entity3=new ParkEntity("Jawarlal Nehru park","North Avenue", 580, 8, 30);
	ParkEntity entity4=new ParkEntity("greenview park", "Kasthuri Nagar", 689, 8, 20);
	
	List<ParkEntity> list=new ArrayList<ParkEntity>();
	list.add(entity);
	list.add(entity1);
	list.add(entity2);
	list.add(entity3);
	list.add(entity4);

	ParkDAO dao=new ParkDAOImpl();
	dao.create(list);
	}	
}
