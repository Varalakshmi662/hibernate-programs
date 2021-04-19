package com.xworkz.cartoon.dao;

import java.util.List;

import com.xworkz.cartoon.entity.CartoonEntity;

public interface CartoonDAO {
public void saveAll(List<CartoonEntity> list);

public CartoonEntity findByName(String name);
}
