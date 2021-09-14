package com.example.employee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.proxy.FeignProxyService;

@RestController
public class EmployeeController {
	
	@Autowired
	public FeignProxyService proxy;
	
	@GetMapping("/getEmployeeDetails")
  public List<String> getEmployeeDetails() {
		return proxy.retrieveDepartmentDetails();
	}
}
