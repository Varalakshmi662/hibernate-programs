package com.xworkz.icecream.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
@Table(name = "icecream_information")
@NamedQueries({
	@NamedQuery(name="getAll", query = "select icecream from IceCreamEntity icecream"),
	@NamedQuery(name="updatePriceByName",query="update IceCreamEntity icecream set icecream.price=:pr where icecream.name=:nm"),
	@NamedQuery(name = "findByNameAndPrice", query = "select icecream from IceCreamEntity icecream where icecream.name=:nm and icecream.price=:pr"),
	@NamedQuery(name = "getByMaxPrice", query = "select icecream from IceCreamEntity icecream where icecream.price=(select max(icecream.price) from IceCreamEntity icecream)"),
	@NamedQuery(name = "getByMinPrice", query = "select icecream from IceCreamEntity icecream where icecream.price=(select min(icecream.price) from IceCreamEntity icecream)"),
	@NamedQuery(name = "getBySumPrice", query = "select sum(price) from IceCreamEntity"),
	@NamedQuery(name = "getPriceByName", query = "select icecream.price from IceCreamEntity icecream where name=:nm"),
	@NamedQuery(name = "getNameAndFlavourByPrice", query = "select ice.name,ice.flavour from IceCreamEntity ice where price=:pr"),
	@NamedQuery(name = "deleteByName", query = "delete from IceCreamEntity ice where ice.name=:nm")
})
public class IceCreamEntity {
//	HibernatePersistenceProvider
	@Id
	@GenericGenerator(name = "supi", strategy = "increment")
	@GeneratedValue(generator = "supi")

	@Column(name = "IC_ID")
	private int id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "FLAVOUR")
	@Enumerated(EnumType.STRING)
	private Flavour flavour;

	@Column(name = "COMPANY")
	private String company;

	@Column(name = "PRICE")
	private double price;

	@Column(name = "COLOR")
	@Enumerated(EnumType.STRING)
	private Color color;

	public enum Color {
		WHITE, GREEN, BROWN, YELLOW, ORANGE, MIX, RED,BLUE,PINK
	}

	public enum Flavour {
		BUTTERSCOTCH, PINEAPPLE, PISTA, KULFI, BLACKFOREST, CHOCOLATE, VANILLA, MIXED,BLUEBEERY
	}

	public IceCreamEntity(String name, Flavour flavour, String company, double price, Color color) {
		super();
		this.name = name;
		this.flavour = flavour;
		this.company = company;
		this.price = price;
		this.color = color;
	}

}
//<property name="hibernate.hbm2ddl.auto" value="create"/>