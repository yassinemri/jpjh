package com.ydev.management.service;

import java.util.List;

import com.ydev.management.dao.Client;
import com.ydev.management.dao.Jpa;

public class ClientServiceImp implements ClientService{
	Jpa dao = new Jpa();
	@Override
	public void add(Client client) {
		dao.add(client);
		
	}

	@Override
	public Client update(Client client) {
		// TODO Auto-generated method stub
		return dao.update(client);
	}

	@Override
	public void delete(Client client) {
		dao.delete(client);
		
	}

	@Override
	public List<Client> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	@Override
	public Client find(int id) {
		// TODO Auto-generated method stub
		return dao.find(id);
	}

}
