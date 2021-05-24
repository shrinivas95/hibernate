package com.xworkz.sewing.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "sewing_table")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class SewingDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	@Column(name = "COLOR")
	private String color;
	@Column(name = "SIZE")
	private String size;
	@Column(name = "NAME")
	private String name;
	@Column(name = "MODEL")
	private String model;
	@Column(name = "PRICE")
	private double price;
	@Column(name = "IS_WORKING")
	private boolean isWorking;

	public SewingDTO(String color, String size, String name, String model, double price, boolean isWorking) {
		super();
		this.color = color;
		this.size = size;
		this.name = name;
		this.model = model;
		this.price = price;
		this.isWorking = isWorking;
	}

}
