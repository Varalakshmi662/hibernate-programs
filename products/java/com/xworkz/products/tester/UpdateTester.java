package com.xworkz.products.tester;

import com.xworkz.products.dao.ProductDAOImpl;

public class UpdateTester {
public static void main(String[] args) {
	new ProductDAOImpl().updateBrandAndQuantityByName("Tv Sony", 1, "Tv");
}
}
