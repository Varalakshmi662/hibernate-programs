package com.xworkz.products.tester;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.products.dao.ProductDAO;
import com.xworkz.products.dao.ProductDAOImpl;
import com.xworkz.products.entity.ProductEntity;
import com.xworkz.products.entity.ProductEntity.ProductType;

public class PersistTester {

	public static void main(String[] args) {
//		ProductEntity entity=new ProductEntity("Tv", ProductType.ELECRONIC, 15000, 12,true, "Li Dongsheng", "TCL");
		ProductEntity entity = new ProductEntity("Remote", ProductType.ELECTRONICDEVICE, 200, 1, false, "India",
				"Airtel");
		ProductEntity entity1 = new ProductEntity("Washing Machine", ProductType.ELECTRONICDEVICE, 25000, 1, false,
				"India", "FBI");
		ProductEntity entity2 = new ProductEntity("fan", ProductType.ELECTRONICDEVICE, 4000, 1, false, "India", "Usha");
		ProductEntity entity3 = new ProductEntity("Transformer", ProductType.ELECTRICITY, 20000, 2, false, "India",
				"ABB");
		ProductEntity entity4 = new ProductEntity("Light", ProductType.HOME_APPLIANCES, 200, 1, false, "India",
				"Wipro");
		ProductEntity entity5 = new ProductEntity("Perfume", ProductType.FASHION, 1500, 1, false, "India", "Fog");
		ProductEntity entity6 = new ProductEntity("Laptop", ProductType.COMPUTERS, 20000, 1, true, "India", "Dell");
		ProductEntity entity7 = new ProductEntity("mouse", ProductType.COMPUTERS, 200, 1, true, "India", "Dell");
		ProductEntity entity8 = new ProductEntity("helmet", ProductType.FASHION, 700, 1, true, "India", "Vega");
		ProductEntity entity9 = new ProductEntity("Nilepolish", ProductType.FASHION, 200, 1, true, "India", "Airtel");

		List<ProductEntity> list = new ArrayList<ProductEntity>();
		list.add(entity);
		list.add(entity1);
		list.add(entity2);
		list.add(entity3);
		list.add(entity4);
		list.add(entity5);
		list.add(entity6);
		list.add(entity7);
		list.add(entity8);
		list.add(entity9);

		ProductDAO dao = new ProductDAOImpl();
		dao.saveAll(list);

		dao.persist(entity);

		ProductEntity entity10 = dao.findByNameAndManufacturer("Tv", "Li Dongsheng");
		System.out.println(entity10);

		ProductEntity entity11 = dao.findByTypeAndBrandAndName("Tv", "TCL", ProductType.ELECRONIC);
		System.out.println(entity11);

		Double entity12 = dao.findPriceByTypeAndBrandAndName("Tv", "TCL", ProductType.ELECRONIC);
		System.out.println(entity12);

		Object[] entity13 = dao.findPriceAndQuantityByTypeAndBrandAndName("Tv", "TCL", ProductType.ELECRONIC);
		System.out.println(entity13[0]);
		System.out.println(entity13[1]);

		ProductEntity entity14 = dao.findByTypeAndBrandAndQuality("Tv", "TCL", true);
		System.out.println(entity14);

		Object[] entity15 = dao.findNameAndTypeById(1);
		System.out.println(entity15[0]);
		System.out.println(entity15[1]);

		Integer entity16 = dao.findMaxId();
		System.out.println(entity16);

		Integer entity17 = dao.findMinId();
		System.out.println(entity17);

		Long entity18 = dao.findSize();
		System.out.println(entity18);

		
		Double entity19 = dao.findMaxPrice();
		System.out.println(entity19);

		Double entity20 = dao.findSumOfPrice();
		System.out.println(entity20);

		ProductEntity entity21 = dao.findDistinct();
		System.out.println(entity21);
	}

}
