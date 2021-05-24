package com.xworkz.sewing;

import com.xworkz.sewing.dao.SewingDAO;
import com.xworkz.sewing.dao.SewingDAOImpl;
import com.xworkz.sewing.dto.SewingDTO;
import com.xworkz.sewing.service.SewingService;
import com.xworkz.sewing.service.SewingServiceImpl;

public class SewingSaveTester {

	public static void main(String[] args) {
		SewingDTO dto = new SewingDTO("Black", "Small", "Panasonic", "Home", 5000.0, true);
		SewingDAO dao = new SewingDAOImpl();
		SewingService service = new SewingServiceImpl();
		boolean valid = service.validateSewing(dto);
		if (valid) {
			dao.save(dto);
		}

	}

}
