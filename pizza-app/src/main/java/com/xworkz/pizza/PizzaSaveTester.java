package com.xworkz.pizza;

import com.xworkz.pizza.dao.PizzaHutDAO;
import com.xworkz.pizza.dao.PizzaHutDAOImpl;
import com.xworkz.pizza.dto.PizzaHutDTO;
import com.xworkz.pizza.service.PizzaService;
import com.xworkz.pizza.service.PizzaServiceImpl;

public class PizzaSaveTester {

	public static void main(String[] args) {
		PizzaHutDTO dto = new PizzaHutDTO("Onion", "Vidyaranyapura", 300, true, "Veg", "Medium");
		PizzaHutDAO dao = new PizzaHutDAOImpl();
		PizzaService service = new PizzaServiceImpl();
		boolean valid = service.validatePizzaDTO(dto);
		if (valid) {
			dao.save(dto);
		}

	}

}
