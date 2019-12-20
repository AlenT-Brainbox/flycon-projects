package com.Flycon.flycon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Flycon.flycon.entity.Leads;
import com.Flycon.flycon.service.LeadsService;

@RestController
@RequestMapping("/api")
public class LeadsController {
	
	@Autowired
	private LeadsService leadsservice;

	@GetMapping("/getall")
	public List<Leads> get(){
		return leadsservice.getAllRecords();
	}
	
	@PostMapping("/save")
	public Leads save(@RequestBody Leads leads) {		
		leadsservice.save(leads);
		return leads;
		
	}
	
	@GetMapping("/getone/{id}")
	public Leads get(@PathVariable int id) {
		return leadsservice.get(id);
	}
}
