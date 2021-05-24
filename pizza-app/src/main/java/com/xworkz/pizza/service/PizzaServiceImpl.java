package com.xworkz.pizza.service;

import com.xworkz.pizza.dto.PizzaHutDTO;

public class PizzaServiceImpl implements PizzaService {
	
	public PizzaServiceImpl() {
		System.out.println("Invoked PizzaServiceImpl");
	}

	
	public boolean validatePizzaDTO(PizzaHutDTO pizzadto) {
		
		if(pizzadto.getName()!=null && pizzadto.getName().length()>=4)
			return true;
		if(pizzadto.getLocation()!=null && pizzadto.getLocation().length()>=4)
			return true;
		if(pizzadto.getPrice()!=0)
			return true;
		if(pizzadto.getType()=="Veg" || pizzadto.getType()=="Non-Veg")
			return true;
		if(pizzadto.getSize()=="Small" || pizzadto.getSize()=="Medium" || pizzadto.getSize()=="Large")
			return true;
		
		return true;
	}

}
