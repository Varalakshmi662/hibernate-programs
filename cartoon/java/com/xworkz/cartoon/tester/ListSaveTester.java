package com.xworkz.cartoon.tester;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.cartoon.dao.CartoonDAO;
import com.xworkz.cartoon.dao.CartoonDAOImpl;
import com.xworkz.cartoon.entity.CartoonEntity;
import com.xworkz.cartoon.entity.CartoonEntity.ChannelName;

public class ListSaveTester {

	public static void main(String[] args) {
		CartoonEntity cartoonEntity = new CartoonEntity("dora","ducktales",ChannelName.POGO, "hindi");
		CartoonEntity cartoonEntity1=new CartoonEntity("Hanuman", "billyandMandy",ChannelName.DISNEYHOTSTAR, "Kannada");
		CartoonEntity cartoonEntity2=new CartoonEntity("Tom", "Tom and Jerry",ChannelName.DISNEYHOTSTAR, "Telugu");
		CartoonEntity cartoonEntity3=new CartoonEntity("Hanuman", "billyandMandy",ChannelName.DISCOVERY, "Kannada");
		CartoonEntity cartoonEntity4=new CartoonEntity("Hanuman", "billyandMandy",ChannelName.POGO, "Hindi");
		CartoonEntity cartoonEntity5=new CartoonEntity("krishna", "littlekrishna",ChannelName.POGO, "English");
		CartoonEntity cartoonEntity6=new CartoonEntity("bheem", "chotabheem",ChannelName.DISNEYHOTSTAR, "English");
		CartoonEntity cartoonEntity7=new CartoonEntity("Hanuman", "billyandMandy",ChannelName.DISCOVERY, "Kannada");
		CartoonEntity cartoonEntity8=new CartoonEntity("Hanuman", "billyandMandy",ChannelName.DISCOVERY, "Kannada");
		CartoonEntity cartoonEntity9=new CartoonEntity("Hanuman", "billyandMandy",ChannelName.DISNEYHOTSTAR, "Kannada");
		
		List<CartoonEntity> list=new ArrayList<CartoonEntity>();
		list.add(cartoonEntity);
		list.add(cartoonEntity1);
		list.add(cartoonEntity2);
		list.add(cartoonEntity3);
		list.add(cartoonEntity4);
		list.add(cartoonEntity5);
		list.add(cartoonEntity6);
		list.add(cartoonEntity7);
		list.add(cartoonEntity8);
		list.add(cartoonEntity9);

		CartoonDAO dao=new CartoonDAOImpl();
		dao.saveAll(list);
	}

}
