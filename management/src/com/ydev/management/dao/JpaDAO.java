package com.ydev.management.dao;

import java.util.List;

public interface JpaDAO {
	public void add(Client client);
	public Client update(Client client);
	public void delete(Client client);
	public List<Client> getAll();
	public Client find(int id);
}
