package com.bonilla.DriverRM.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bonilla.DriverRM.entity.TruckDriver;

public interface DriverRepository extends JpaRepository<TruckDriver, Integer> {

	//add a method to sort by last name
}