package com.Flycon.flycon.service;

import java.util.List;

import com.Flycon.flycon.entity.Leads;

public interface LeadsService {
	
	List<Leads> getAllRecords();
	Leads get(int id);
	void save(Leads e);
	void delete(int id);

}
