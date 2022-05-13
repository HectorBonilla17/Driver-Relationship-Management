package com.bonilla.DriverRM.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "driver_info")
public class TruckDriver {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "company")
	private String company;
	
	@Column(name = "pin")
	private String pin;
	
	@Column(name = "truck")
	private String truck;
	
	//-------------------------------------

	public TruckDriver() {}

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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getTruck() {
		return truck;
	}

	public void setTruck(String truck) {
		this.truck = truck;
	}

	//-------------------------------------

}
