package com.example.mysql2.demomysql2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Usercontroller {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/home")
	public String call()
	{
		return "hello ";
	}

}
