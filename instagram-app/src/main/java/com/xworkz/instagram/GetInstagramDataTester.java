package com.xworkz.instagram;

import com.xworkz.instagram.dao.InstagramDAO;
import com.xworkz.instagram.dao.InstagramDAOImpl;

public class GetInstagramDataTester {

	public static void main(String[] args) {
		InstagramDAO dao = new InstagramDAOImpl();
		dao.getInstagramData();

	}

}
