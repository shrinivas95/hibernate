package com.xworkz.pizza.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
//import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "pizza_table")
@Getter
@Setter
@NoArgsConstructor
@ToString

public class PizzaHutDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PIZZA_ID")
	private int id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "LOCATION")
	private String location;

	@Column(name = "PRICE")
	private double price;

	@Column(name = "IS_AVAILABLE")
	private boolean isAvailable;

	@Column(name = "TYPE")
	private String type;

	@Column(name = "SIZE")
	private String size;

	public PizzaHutDTO(String name, String location, double price, boolean isAvailable, String type, String size) {
		super();
		System.out.println(this.getClass().getSimpleName() + "Object Created");
		this.name = name;
		this.location = location;
		this.price = price;
		this.isAvailable = isAvailable;
		this.type = type;
		this.size = size;
	}

}
