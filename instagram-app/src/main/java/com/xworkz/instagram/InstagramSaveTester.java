package com.xworkz.instagram;

import com.xworkz.instagram.dao.InstagramDAO;
import com.xworkz.instagram.dao.InstagramDAOImpl;
import com.xworkz.instagram.dto.InstagramDTO;
import com.xworkz.instagram.service.InstagramService;
import com.xworkz.instagram.service.InstagramServiceImpl;

public class InstagramSaveTester {

	public static void main(String[] args) {
		InstagramDTO dto = new InstagramDTO(2000000,5.1f,25,2500000,true,"Social");
		InstagramDAO dao = new InstagramDAOImpl();
		InstagramService service = new InstagramServiceImpl();
		boolean valid = service.validateInstagramData(dto);
		if(valid) {
			dao.save(dto);
		}

	}

}
