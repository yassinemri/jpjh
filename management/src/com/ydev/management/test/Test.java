package com.ydev.management.test;


//import java.util.List;

import com.ydev.management.dao.Client;
import com.ydev.management.dao.Jpa;


public class Test {
	
	public static void main(String[] args) {
		Jpa dao = new Jpa();
		Client client= new Client();
		client.setBday("12/12/1980");
		client.setEmail("yazane@gmail.com");
		
//		dao.getAll();
		System.out.println(dao.getAll());
	}

}
