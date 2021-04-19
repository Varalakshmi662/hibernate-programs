package com.xworkz.products.tester;

import java.util.List;

import com.xworkz.products.dao.ProductDAOImpl;
import com.xworkz.products.entity.ProductEntity;

public class FindallTester {
public static void main(String[] args) {
	List<ProductEntity> entities=new ProductDAOImpl().findAll();
	System.out.println(entities);
}
}
