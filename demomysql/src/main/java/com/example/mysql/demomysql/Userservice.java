package com.example.mysql.demomysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Service
@Component
public class Userservice {
	
	@Autowired
	private UserRespository repository;
	
	public Usermodel savedetails(Usermodel usermodel )
	{
		return  repository.save(usermodel);
	}	

}
