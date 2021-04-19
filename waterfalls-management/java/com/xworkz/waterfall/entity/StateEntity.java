package com.xworkz.waterfall.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name="state_information")
public class StateEntity {
	
	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name="ID")
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="LANGUAGE")
	private String language;
	@Column(name="NO_OF_DISTRICTS")
	private int noOfDistricts;
	@Column(name="POPULATION")
	private int population;
	public StateEntity(String name, String language, int noOfDistricts, int population) {
		super();
		this.name = name;
		this.language = language;
		this.noOfDistricts = noOfDistricts;
		this.population = population;
	}
	
	
}
