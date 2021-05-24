package com.xworkz.instagram.service;

import com.xworkz.instagram.dto.InstagramDTO;

public class InstagramServiceImpl implements InstagramService {

	public boolean validateInstagramData(InstagramDTO instagramDTO) {

		if (instagramDTO.getNoOfUsers() != 0)
			return true;
		if (instagramDTO.getNoOfFeatures() != 0)
			return true;
		if (instagramDTO.getNetWorth() != 0)
			return true;
		if (instagramDTO.getType() != null && instagramDTO.getType().length() >= 4)
			return true;
		if (instagramDTO.getVersion() != 0)
			return true;
		return false;
	}

}
