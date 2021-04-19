package com.xworkz.coupon.Tester;

import java.util.ArrayList;
import java.util.List;
import com.xworkz.coupon.dao.CouponDAO;
import com.xworkz.coupon.dao.CouponDAOImpl;
import com.xworkz.coupon.entity.CouponEntity;

public class ListTester {

	public static void main(String[] args) {
		CouponEntity entity=new CouponEntity();
		entity.setCouponCode("DE67Fj");
		entity.setCouponType("Food");
		entity.setName("Jio");
		entity.setValidateDays(45);

		CouponEntity entity1=new CouponEntity();
		entity.setCouponCode("GJT7Fj");
		entity.setCouponType("Bevarages");
		entity.setName("Flipkart");
		entity.setValidateDays(35);

		CouponEntity entity2=new CouponEntity();
		entity.setCouponCode("gsg7Fj");
		entity.setCouponType("Goggles");
		entity.setName("Lenskart");
		entity.setValidateDays(30);

		CouponEntity entity3=new CouponEntity();
		entity.setCouponCode("6267Fj");
		entity.setCouponType("Groceries");
		entity.setName("JIO Mart");
		entity.setValidateDays(40);
		
		List<CouponEntity> list=new ArrayList<CouponEntity>();
		list.add(entity);
		list.add(entity1);
		list.add(entity2);
		list.add(entity3);

		CouponDAO dao=new CouponDAOImpl();
		dao.create(list);
	}

}
