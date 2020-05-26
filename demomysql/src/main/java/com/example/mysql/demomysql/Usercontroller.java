package com.example.mysql.demomysql;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Usercontroller {
	
	@Autowired
	private Userservice userservice;
	
	@GetMapping("/home")
	public Usermodel adddetails(@RequestBody Usermodel model) {
		return userservice.savedetails(model);
		
	}
	

}
