package com.ydev.management.service;

import java.util.List;

import com.ydev.management.dao.Client;

public interface ClientService {
	public void add(Client client);
	public Client update(Client client);
	public void delete(Client client);
	public List<Client> getAll();
	public Client find(int id);
}
