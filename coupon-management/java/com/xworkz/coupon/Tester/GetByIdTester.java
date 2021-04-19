package com.xworkz.coupon.Tester;

import com.xworkz.coupon.dao.CouponDAOImpl;
import com.xworkz.coupon.entity.CouponEntity;

public class GetByIdTester {

	public static void main(String[] args) {
		CouponEntity entity=new CouponDAOImpl().getById(1);
		System.out.println(entity);
	}

}
