package com.xworkz.parks.tester;

import com.xworkz.parks.dao.ParkDAO;
import com.xworkz.parks.dao.ParkDAOImpl;
import com.xworkz.parks.entity.ParkEntity;

public class SaveorCreateTester {

	public static void main(String[] args) {
		ParkEntity entity=new ParkEntity("Coles park", "pulikeshi nagar", 27280, 8, 20);
				
		ParkDAO dao=new ParkDAOImpl();
		dao.save(entity);
	}

}
