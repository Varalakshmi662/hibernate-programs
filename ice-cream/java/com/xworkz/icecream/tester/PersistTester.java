package com.xworkz.icecream.tester;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.icecream.entity.IceCreamEntity;
import com.xworkz.icecream.entity.IceCreamEntity.Color;
import com.xworkz.icecream.entity.IceCreamEntity.Flavour;
import com.xworkz.icecream.repository.IceCreamRepository;
import com.xworkz.icecream.repository.IceCreamRepositoryImpl;

public class PersistTester {

	public static void main(String[] args) {
//		IceCreamEntity entity=new IceCreamEntity("Honey Moon", Flavour.MIXED, "For Profit", 300, Color.MIX);
		IceCreamEntity entity=new IceCreamEntity("Blueberry cheese", Flavour.BLUEBEERY, "arun",350, Color.WHITE);
		IceCreamEntity entity1=new IceCreamEntity("caramel toffe crunch", Flavour.BLUEBEERY, "arun",300, Color.YELLOW);
		IceCreamEntity entity2=new IceCreamEntity("domunt-jelly", Flavour.BLUEBEERY, "arun",140, Color.WHITE);
		IceCreamEntity entity3=new IceCreamEntity("domunt-vanilla", Flavour.VANILLA, "Baskin-Robbins",150, Color.ORANGE);
		IceCreamEntity entity4=new IceCreamEntity("corneto ", Flavour.PISTA, "Cornetto",50, Color.BROWN);
		IceCreamEntity entity5=new IceCreamEntity("Blue-Moon", Flavour.BUTTERSCOTCH, "Milwaukee",200, Color.BLUE);
		IceCreamEntity entity6=new IceCreamEntity("rasberry Ripple", Flavour.VANILLA, "arun",350, Color.PINK);
		IceCreamEntity entity7=new IceCreamEntity("Spumoni", Flavour.BLUEBEERY, "Spuman",370, Color.WHITE);
		IceCreamEntity entity8=new IceCreamEntity("Pistachio", Flavour.BLUEBEERY, "pista",390, Color.WHITE);
		IceCreamEntity entity9=new IceCreamEntity("Grape-Nut", Flavour.PISTA, "Nuts",170, Color.WHITE);
		IceCreamEntity entity10=new IceCreamEntity("rocky road", Flavour.CHOCOLATE, "Cookies",160, Color.BROWN);

		List<IceCreamEntity> entities=new ArrayList<IceCreamEntity>();
		entities.add(entity);
		entities.add(entity1);
		entities.add(entity2);
		entities.add(entity3);
		entities.add(entity4);
		entities.add(entity5);
		entities.add(entity6);
		entities.add(entity7);
		entities.add(entity8);
		entities.add(entity9);
		entities.add(entity10);
		
		IceCreamRepository impl = new IceCreamRepositoryImpl();
		impl.persistAll(entities);

//		IceCreamRepository impl = new IceCreamRepositoryImpl();
//		impl.persist(entity);
	}

}