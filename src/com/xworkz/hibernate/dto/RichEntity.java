package com.xworkz.hibernate.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor

@Entity
@Table(name = "RICH_ENTITY")

public class RichEntity {

	@Id
	@Column(name="ID")
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="NET_WORTH_IN_BILLION")
	private int netWorthInBillion;
	@Column(name="COUNTRY")
	private String country;
	@Column(name="MARRIED")
	private boolean married;
	@Column(name="BUSSINESS")
	private String bussiness;
	@Column(name="RANK_VALUE")
	private int rank;
}
