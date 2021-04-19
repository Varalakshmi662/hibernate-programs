package com.xworkz.coupon.Tester;

import com.xworkz.coupon.dao.CouponDAOImpl;
import com.xworkz.coupon.entity.CouponEntity;

public class UpdateTester {

	public static void main(String[] args) {
		
	 CouponEntity entity = new CouponDAOImpl().updateNameAndCouponTypeById("Lenskart", "goggles", 1);
	 System.out.println(entity);
	}

}

