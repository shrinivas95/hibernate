package com.xworkz.sewing.dao;

import com.xworkz.sewing.dto.SewingDTO;

public interface SewingDAO {
	
	public void save(SewingDTO sewingDTO);
	
	public void getSewingData();
	
	public void updateSewing();
	
	public void deleteSewingData();

}
