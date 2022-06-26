package com.bank.dao;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.bank.dao.util.UtilEm;
import com.core.models.Client;

public class ClientDaoJpa implements IClient{

	EntityManager em;
	
	public ClientDaoJpa(EntityManager em) {
		super();
		this.em = em;
	}

	public ClientDaoJpa(String nom) {
		super();
		em=UtilEm.getem(nom);
	}

	
	public ClientDaoJpa() {
		super();
		em=UtilEm.getem("unitdao");
	}

	@Override
	public void add(Client t) {
		
		
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		em.close();
		
	}

	@Override
	public Client findById(Long id) {
		
		Client c = em.find(Client.class, id);
		
		return c;
	}

	@Override
	public List<Client> all() {
		Query q = em.createQuery("from Client c ");
		List<Client> ls = q.getResultList();
		return ls;
	}

	@Override
	public void delete(Client t) {
		
		em.getTransaction().begin();
		em.remove(t);
		
		em.getTransaction().commit();
		em.close();
		
	}

	@Override
	public void update(Client t, Long id) {
		Client c = em.find(Client.class, id);
		c.setNom(t.getNom());
		c.setEmail(t.getEmail());
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		em.close();
		
	}

	@Override
	public <E> List<E> findProp() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> findBycritere(Predicate<Client> condition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void action(Consumer<Client> consumer, Client t) {
		// TODO Auto-generated method stub
		
	}

}
