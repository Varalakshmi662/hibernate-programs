package com.xworkz.waterfall.tester;

import com.xworkz.waterfall.dao.FallsDAOImpl;

public class DeleteTester {

	public static void main(String[] args) {
		new FallsDAOImpl().deleteById(2);
	}

}
