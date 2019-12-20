package com.Flycon.flycon.Dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Flycon.flycon.entity.Leads;


@Repository
public class LeadsDaoImpl implements LeadsDao {
	
	@Autowired
	private EntityManager entitymanager;
	

	@Override
	public List<Leads> getAllRecords() {
		Session currentSession = entitymanager.unwrap(Session.class);
		Query<Leads> query= currentSession.createQuery("from Leads",Leads.class);
		List<Leads> list = query.getResultList();
		return list;
	}

	@Override
	public Leads get(int id) {
		Session currentSession = entitymanager.unwrap(Session.class);
		Leads leads = currentSession.get(Leads.class, id);
		return leads;
	}

	@Override
	public void save(Leads e) {
		Session currentSession = entitymanager.unwrap(Session.class);
		currentSession.save(e);
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
