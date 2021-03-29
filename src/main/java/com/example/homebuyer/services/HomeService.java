package com.example.homebuyer.services;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.homebuyer.beans.Home;

//business logic

@Service
public class HomeService {

	
	public HomeService() {
		System.out.println("Service Created");
	}
	
	public Home save(Home home) {
		return new Home();
	}
	
	public List<Home> findAll(){
		return new LinkedList();
	}
	
	
}
