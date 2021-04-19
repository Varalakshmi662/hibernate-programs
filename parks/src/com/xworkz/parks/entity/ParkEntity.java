package com.xworkz.parks.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name="park_information")
public class ParkEntity {
	@Id 
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name="P_ID")
	private int pId;
	@Column(name="NAME")
	private String name;
	@Column(name="LOCATION")
	private String location;
	@Column(name="DIMENSION")
	private int dimensions;
	@Column(name="NO_OF_HOURS_OPEN")
	private int noOfHoursOpen;
	@Column(name="ENTRY_FEES")
	private int entryFees;
	public ParkEntity(String name, String location, int dimensions, int noOfHoursOpen, int entryFees) {
		super();
		this.name = name;
		this.location = location;
		this.dimensions = dimensions;
		this.noOfHoursOpen = noOfHoursOpen;
		this.entryFees = entryFees;
	}
	
}
