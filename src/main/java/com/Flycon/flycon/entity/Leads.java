package com.Flycon.flycon.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="flycon_table")
public class Leads {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String mobile;
	@Column
	private String enquiry;
	@Column
	private Date expectedPurchaseDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEnquiry() {
		return enquiry;
	}
	public void setEnquiry(String enquiry) {
		this.enquiry = enquiry;
	}
	public Date getExpectedPurchaseDate() {
		return expectedPurchaseDate;
	}
	public void setExpectedPurchaseDate(Date expectedPurchaseDate) {
		this.expectedPurchaseDate = expectedPurchaseDate;
	}
//	@Override
//	public String toString() {
//		return "Leads [id=" + id + ", name=" + name + ", mobile=" + mobile + ", enquiry=" + enquiry
//				+ ", expectedPurchaseDate=" + expectedPurchaseDate + "]";
//	}

	
}
