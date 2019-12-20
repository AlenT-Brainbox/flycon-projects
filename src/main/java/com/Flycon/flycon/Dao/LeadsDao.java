package com.Flycon.flycon.Dao;

import java.util.List;
import com.Flycon.flycon.entity.Leads;

public interface LeadsDao {

	List<Leads> getAllRecords();
	Leads get(int id);
	void save(Leads e);
	void delete(int id);
}
