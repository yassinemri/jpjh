package com.ydev.management.view;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


import com.ydev.management.dao.Client;
import com.ydev.management.dao.Jpa;

@ManagedBean
@SessionScoped
public class CrudBean {
	Jpa dao = new Jpa();
	private List<Client> clients;
	public String delete(Client client)
	{
		dao.delete(client);
		clients = dao.getAll();
		return "index.xhtml?faces-redirect=true";
		
	}
	
	public List<Client> getClients(){
		return clients;
	}
	
	public List<Client> load()
	{
		return dao.getAll();
	}

}
