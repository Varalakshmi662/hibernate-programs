package com.xworkz.waterfall.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "waterfallsinformation")
public class WaterFallsEntity {

	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name = "WID")
	private int wId;
	@Column(name = "NAME")
	private String name;
	@Column(name = "LOCATION")
	private String location;
	@Column(name = "HEIGHT")
	private double height;
	@Column(name = "DEPTH")
	private double depth;
	@Column(name = "ELECTRICITY_GENERATED")
	private boolean electricityGenerated;
	@Column(name = "SOURCE_RIVER")
	private String sourceRiver;
	@Column(name = "ENTRY_FEES")
	private int entryFees;
	@Column(name = "DESTINATION")
	private String destination;
	@Column(name = "RATING")
	private int rating;
	@Column(name = "NO_OF_DEATHS")
	private int noOfDeaths;
	@Column(name = "NO_OF_VISITORS")
	private int noOfVisitors;
}
