package com.bonilla.DriverRM.service;

import java.util.List;

import com.bonilla.DriverRM.entity.TruckDriver;

public interface TruckDriverService {
	public List<TruckDriver> findAll();
	public TruckDriver findById(int theId);
	public void save(TruckDriver theDriver);
	public void deleteById(int theId);
}
