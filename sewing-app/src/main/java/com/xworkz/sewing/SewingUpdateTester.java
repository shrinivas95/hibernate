package com.xworkz.sewing;

import com.xworkz.sewing.dao.SewingDAO;
import com.xworkz.sewing.dao.SewingDAOImpl;

public class SewingUpdateTester {

	public static void main(String[] args) {
		SewingDAO dao = new SewingDAOImpl();
		dao.updateSewing();

	}

}
