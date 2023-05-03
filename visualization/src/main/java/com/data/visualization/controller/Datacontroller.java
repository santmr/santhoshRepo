package com.data.visualization.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.data.visualization.pojo.Datapojo;
import com.data.visualization.service.Dataservice;

@RestController
public class Datacontroller {
	@Autowired
	Dataservice dataservice;

	@PostMapping("/upload")
	public void uploadData(@ModelAttribute Datapojo datapojo) throws Exception {
		dataservice.saveDetails(datapojo);

	}
	
	@GetMapping("/welcome")
        public String welcome()
	{
		return "welcome to springboot";
	}
}
