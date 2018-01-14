package com.ydev.management.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.ydev.management.tools.Hibernate;



public class Jpa implements JpaDAO{
	
    private EntityManager em = Hibernate.openSession();
	
	public void add(Client client) {
		
		em.getTransaction().begin();
		
		em.merge(client);
		
		em.getTransaction().commit();

	}

	public Client update(Client client) {
		em.getTransaction().begin();
		Client c = (Client) em.merge(client);
		em.getTransaction().commit();
		return c;
	}

	public void delete(Client client) {

		em.getTransaction().begin();
		em.remove(em.contains(client) ? client : em.merge(client));
		em.getTransaction().commit();
	}
	
	public Client find(int id)
	{
		em.getTransaction().begin();
		return (Client) em.find(Client.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Client> getAll() {
		em.getTransaction().begin();
		List<Client> clients = em.createQuery("SELECT c FROM Client c").getResultList();
		em.getTransaction().commit();
		
		return clients;
	}

}
