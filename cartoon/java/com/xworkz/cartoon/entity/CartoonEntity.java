package com.xworkz.cartoon.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="cartoon_information")
public class CartoonEntity {

	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator = "auto")
	
	@Column(name="C_ID")
	private int cId;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="SHOW_NAME")
	private String showName;
	
	@Column(name="CHANNEL_NAME")
	private ChannelName channelName;
	
	public enum ChannelName{
		DISNEYHOTSTAR,POGO,DISCOVERY
	}
	
	@Column(name="LANGUAGE")
	private String language;

	public CartoonEntity(String name, String showName, ChannelName channelName, String language) {
		super();
		this.name = name;
		this.showName = showName;
		this.channelName = channelName;
		this.language = language;
	}
	
	
}
