package com.xworkz.sewing;

import com.xworkz.sewing.dao.SewingDAO;
import com.xworkz.sewing.dao.SewingDAOImpl;

public class SewingDeleteRecordTester {

	public static void main(String[] args) {
		SewingDAO dao = new SewingDAOImpl();
		dao.deleteSewingData();

	}

}
