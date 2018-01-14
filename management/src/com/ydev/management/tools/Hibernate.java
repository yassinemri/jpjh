package com.ydev.management.tools;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Hibernate {

	private static EntityManager em;
	public static EntityManager openSession()
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("clientsUI");
		em = emf.createEntityManager();
		return em;
	}
}
