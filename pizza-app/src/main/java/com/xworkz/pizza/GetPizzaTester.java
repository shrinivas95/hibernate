package com.xworkz.pizza;

import com.xworkz.pizza.dao.PizzaHutDAO;
import com.xworkz.pizza.dao.PizzaHutDAOImpl;

public class GetPizzaTester {

	public static void main(String[] args) {

		PizzaHutDAO dao = new PizzaHutDAOImpl();
		dao.getPizzaData();

	}

}
