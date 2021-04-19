package com.xworkz.coupon.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name="coupon_information")
public class CouponEntity {
	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	
	@Column(name="C_ID")
	private int cId;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="COUPON_TYPE")
	private String couponType;
	
	@Column(name="VALIDATE_DAYS")
	private int validateDays;
	
	@Column(name="COUPON_CODE")
	private String couponCode;
}
