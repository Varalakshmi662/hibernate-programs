package com.xworkz.products.dao;

import java.util.List;
import com.xworkz.products.entity.ProductEntity;
import com.xworkz.products.entity.ProductEntity.ProductType;

public interface ProductDAO {
	
	public void persist(ProductEntity entity);
	
	public void saveAll(List<ProductEntity> list);
	
	public ProductEntity findByNameAndManufacturer(String name,String manuf);

	public ProductEntity findByTypeAndBrandAndName(String name,String brand,ProductType type);
	
	public Double findPriceByTypeAndBrandAndName(String name, String brand,ProductType type);
	
	public Object[] findPriceAndQuantityByTypeAndBrandAndName(String name,String brand,ProductType type);
	
	public ProductEntity findByTypeAndBrandAndQuality(String name, String brand,boolean quality);
	
	public Object[] findNameAndTypeById(int id);
	
	public int findMaxId();
	
	public long findSize();
	
	public double findMaxPrice();
	
	public double findSumOfPrice();
	
	public int findMinId();
	
	public ProductEntity findDistinct();
	
	public List<ProductEntity> findAll();
	
	public List<ProductEntity> findAllIds();
	
	public void updateBrandAndQuantityByName(String brand,int quantity,String name);
}
