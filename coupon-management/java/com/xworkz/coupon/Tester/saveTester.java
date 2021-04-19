package com.xworkz.coupon.Tester;

import com.xworkz.coupon.dao.CouponDAO;
import com.xworkz.coupon.dao.CouponDAOImpl;
import com.xworkz.coupon.entity.CouponEntity;

public class saveTester {

	public static void main(String[] args) {
		CouponEntity entity=new CouponEntity();
		entity.setCouponCode("DE67Fj");
		entity.setCouponType("Food");
		entity.setName("Jio");
		entity.setValidateDays(45);
		
		CouponDAO dao=new CouponDAOImpl();
		dao.save(entity);
	}

}
