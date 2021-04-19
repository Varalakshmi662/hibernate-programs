package com.xworkz.parks.tester;

import com.xworkz.parks.dao.ParkDAOImpl;

public class DeleteTester {

	public static void main(String[] args) {

		new ParkDAOImpl().deleteById(1);

	}

}
