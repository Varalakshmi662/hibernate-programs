package com.xworkz.parks.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SFUtil {
	private static SessionFactory factory;
	public static SessionFactory getFactory() {
		return factory;
	}
	static {
		System.out.println("init static block");
		try {
			Configuration config=new Configuration();
			config.configure();
			factory=config.buildSessionFactory();
			if(factory!=null) {
				System.out.println("factory created sucessfully");
		}else {
			throw new SessionFactoryCreatedException("factory not initiated");
		}
	}catch (Exception e) {
		throw new SessionFactoryCreatedException(e.getMessage());

		}
		}
}
