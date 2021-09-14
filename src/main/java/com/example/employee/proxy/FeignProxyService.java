package com.example.employee.proxy;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="department-service")
@RibbonClient(name="department-service")  
public interface FeignProxyService {	
	@GetMapping("/department-service/getDetails")
	public List<String> retrieveDepartmentDetails();

}

