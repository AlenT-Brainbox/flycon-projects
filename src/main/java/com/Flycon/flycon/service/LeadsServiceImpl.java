package com.Flycon.flycon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Flycon.flycon.Dao.LeadsDao;
import com.Flycon.flycon.entity.Leads;


@Service
public class LeadsServiceImpl implements LeadsService {
	
	@Autowired
	private LeadsDao leadsdao;
	
	@Transactional
	@Override
	public List<Leads> getAllRecords() {
		return leadsdao.getAllRecords();
	}

	@Override
	public Leads get(int id) {
		return leadsdao.get(id);
	}

	@Override
	public void save(Leads e) {
		leadsdao.save(e);
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	
}
