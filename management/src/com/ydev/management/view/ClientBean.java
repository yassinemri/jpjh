package com.ydev.management.view;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.ydev.management.dao.Client;
import com.ydev.management.dao.Jpa;

@ManagedBean
@RequestScoped
public class ClientBean {

	Client client = new Client();
	Jpa dao = new Jpa();
	
	public String addClient()
	{
		dao.add(client);
		return "success?faces-redirect=true";
	}
	public Client getClient()
	{
		return client;
	}
}
