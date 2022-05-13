package com.bonilla.DriverRM.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bonilla.DriverRM.dao.DriverRepository;
import com.bonilla.DriverRM.entity.TruckDriver;

@Service
public class TruckDriverServiceImpl implements TruckDriverService {

	private DriverRepository driverRepository;

	@Autowired
	public TruckDriverServiceImpl(DriverRepository theDriverRepository) {
		driverRepository = theDriverRepository;
	}
	
	@Override
	public List<TruckDriver> findAll() {
		return driverRepository.findAll();
	}

	@Override
	public TruckDriver findById(int theId) {
		Optional<TruckDriver> result = driverRepository.findById(theId);
		
		TruckDriver theDriver = null;
		if(result.isPresent()) {
			theDriver = result.get();
		} else {
			throw new RuntimeException("Did not find driver with id - " + theId);
		}
		
		return theDriver;
	}

	@Override
	public void save(TruckDriver theDriver) {
		driverRepository.save(theDriver);
	}

	@Override
	public void deleteById(int theId) {
		driverRepository.deleteById(theId);
	}

}
