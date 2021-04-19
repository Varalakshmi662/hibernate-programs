package com.xworkz.products.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Product_Information")
@NamedQueries({ @NamedQuery(name = "findAll", query = "select product from ProductEntity product"),
		@NamedQuery(name = "findAllIds", query = "select product.pid from ProductEntity product"),
		@NamedQuery(name = "updateBrandAndQuantityByName", query = "update ProductEntity set brand=:brand,quantity=:quantity where name=:name")
})
public class ProductEntity {

	@Id
	@GenericGenerator(name = "bus", strategy = "increment")
	@GeneratedValue(generator = "bus")
	@Column(name = "P_ID")
	private int pid;
	@Column(name = "NAME")
	private String name;
	@Column(name = "TYPE")
	private ProductType type;
	@Column(name = "PRICE")
	private double price;
	@Column(name = "QUANTITY")
	private int quantity;
	@Column(name = "QUALITY")
	private boolean quality;
	@Column(name = "MANUFACTURER")
	private String manufacturer;
	@Column(name = "BRAND")
	private String brand;

	public enum ProductType {
		HOME_APPLIANCES, ELECRONIC, COMPUTERS, FASHION, ELECTRICITY, ELECTRONICDEVICE
	}

	public ProductEntity(String name, ProductType type, double price, int quantity, boolean quality,
			String manufacturer, String brand) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
		this.quality = quality;
		this.manufacturer = manufacturer;
		this.brand = brand;
	}

}