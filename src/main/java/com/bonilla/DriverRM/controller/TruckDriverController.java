package com.bonilla.DriverRM.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bonilla.DriverRM.entity.TruckDriver;
import com.bonilla.DriverRM.service.TruckDriverService;


@Controller
@RequestMapping("/drivers")
public class TruckDriverController {

	private TruckDriverService driverService;
	
	@Autowired
	public TruckDriverController(TruckDriverService theDriverService) {
		driverService = theDriverService;
	}
	
	@GetMapping("/list")
	public String listDrivers(Model theModel) {
		
		List<TruckDriver> theDrivers;
		try {
			theDrivers = driverService.findAll();
		} catch (Exception e) {
			theDrivers = new ArrayList();
			TruckDriver temp1 = new TruckDriver();

			temp1.setId(1);
			temp1.setCompany("");
			temp1.setName("Test");
			temp1.setPin("");
			temp1.setTruck("");

			theDrivers.add(temp1);
		}
		
		theModel.addAttribute("drivers", theDrivers);
		
		return "list-drivers";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		TruckDriver theDriver = new TruckDriver();
		
		theModel.addAttribute("driver", theDriver);
		
		return "driver-form";
	}
	
	@PostMapping("/save")
	public String saveDriver(@ModelAttribute("driver") TruckDriver theDriver) {
		
		driverService.save(theDriver);
		
		return "redirect:/drivers/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String updateDriver(@RequestParam("driverId") int theId, Model theModel) {
		
		TruckDriver theDriver = driverService.findById(theId);
		
		theModel.addAttribute("driver", theDriver);
		
		return "driver-form";
	}
	
	@GetMapping("/delete")
	public String deleteDriver(@RequestParam("driverId") int theId) {
		
		driverService.deleteById(theId);
		
		return "redirect:/drivers/list";
	}
}
