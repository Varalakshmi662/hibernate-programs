package com.xworkz.icecream.tester;

import java.util.List;
import com.xworkz.icecream.entity.IceCreamEntity;
import com.xworkz.icecream.repository.IceCreamRepositoryImpl;

public class GetAllTester {

	public static void main(String[] args) {
//		List<IceCreamEntity> list = new IceCreamRepositoryImpl().getAll();
//		System.out.println(list);
//		
//		new IceCreamRepositoryImpl().updatePriceByName("corneto",50);
//		
		IceCreamEntity entity = new IceCreamRepositoryImpl().findByNameAndPrice("domunt-vanilla",150);
		System.out.println(entity);
		
		IceCreamEntity entity1 = new IceCreamRepositoryImpl().getByMaxPrice();
		System.out.println(entity1);

		IceCreamEntity entity2 = new IceCreamRepositoryImpl().getByMinPrice();
		System.out.println(entity2); 
		
		Double sumPrice = new IceCreamRepositoryImpl().getBySumPrice();
		System.out.println(sumPrice);
		
		Double price = new IceCreamRepositoryImpl().getPriceByName("domunt-vanilla");
		System.out.println(price);
		
		List<Object[]> price2 = new IceCreamRepositoryImpl().getNameAndFlavourByPrice(310);
		System.out.println("name:");
		price2.forEach(a->System.out.println(a[0]));
		System.out.println("flavour");
		price2.forEach(a->System.out.println(a[1]));
		
		new IceCreamRepositoryImpl().deleteByName("Blueberry cheese");
		
	}

}
