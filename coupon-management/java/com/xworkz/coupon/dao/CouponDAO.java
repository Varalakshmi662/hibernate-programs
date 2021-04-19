package com.xworkz.coupon.dao;

import java.util.List;

import com.xworkz.coupon.entity.CouponEntity;

public interface CouponDAO {
	public void save(CouponEntity entity);
	
	 public void create(List<CouponEntity> entities);
	 
	 public CouponEntity getById(int id);
	 
	 public CouponEntity updateNameAndCouponTypeById(String name,String type,int id);
	 
	 public void deleteById(int id);
}
