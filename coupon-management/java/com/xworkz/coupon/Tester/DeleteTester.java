package com.xworkz.coupon.Tester;

import com.xworkz.coupon.dao.CouponDAOImpl;

public class DeleteTester {

	public static void main(String[] args) {
		new CouponDAOImpl().deleteById(1);
	}

}
