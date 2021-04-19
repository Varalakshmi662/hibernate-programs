package com.xworkz.waterfall;

import org.hibernate.SessionFactory;

import com.xworkz.waterfall.util.SFUtil;

public class Tester {

	public static void main(String[] args) {
		SessionFactory factory=SFUtil.getFactory();
		System.out.println(factory);
	}

}
