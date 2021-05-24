package com.xworkz.sewing.service;

import com.xworkz.sewing.dto.SewingDTO;

public class SewingServiceImpl implements SewingService {

	public boolean validateSewing(SewingDTO sewingDTO) {
		
		if(sewingDTO.getColor()!=null && sewingDTO.getColor().length()>=4)
			return true;
		if(sewingDTO.getSize()!=null && sewingDTO.getSize().length()>=4)
			return true;
		if(sewingDTO.getName()!=null && sewingDTO.getName().length()>=4)
			return true;
		if(sewingDTO.getModel()!=null && sewingDTO.getModel().length()>=4)
			return true;
		if(sewingDTO.getPrice()!=0)
			return true;
		
		return true;
		
		
	}

}
