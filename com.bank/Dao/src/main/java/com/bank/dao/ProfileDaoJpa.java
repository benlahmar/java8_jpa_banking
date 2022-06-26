package com.bank.dao;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.bank.dao.util.UtilEm;
import com.core.models.Client;
import com.core.models.Profil;

public class ProfileDaoJpa implements IProfil{

	EntityManager em;
	
	
	public ProfileDaoJpa() {
		super();
		em=UtilEm.getem("unitdao");
	}

	@Override
	public void add(Profil t) {
		
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		em.close();
		
	}

	@Override
	public Profil findById(Long id) {
		return em.find(Profil.class, id);
		
	}

	@Override
	public List<Profil> all() {
		return em.createQuery("from Profil").getResultList();
		
	}

	@Override
	public void delete(Profil t) {
		em.getTransaction().begin();
		t= em.find(Profil.class, t.getId());
		em.remove(t);
		em.getTransaction().commit();
	}

	@Override
	public void update(Profil t, Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <E> List<E> findProp() {
		
		return null;
	}

	@Override
	public List<Profil> findBycritere(Predicate<Profil> condition) {
		//exemple 1
		List<Profil> res = em.createQuery("from Profil").getResultList();
		List<Profil> res1 = res		
		.stream()
		.filter(condition)
		.collect(Collectors.toList());
		
		
		return res1;
	}

	@Override
	public void add(Profil p, long idclient) {

		em.getTransaction().begin();
		Client c = em.find(Client.class, idclient);
		p.setClient(c);
		em.persist(p);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public Profil auth(String username, String pass) {
		
		
		Query q = em.createQuery("from Profil p where p.username=:u and p.pass=:p");
		q.setParameter("u", username);
		q.setParameter("p", pass);
		List<Profil> p = q.getResultList();
		Optional<Profil> op = p.stream().findFirst();
		if(op.isPresent())
			return op.get();
		else
			return null;
		
		
	}

	@Override
	public void action(Consumer<Profil> consumer, Profil t) {
		// TODO Auto-generated method stub
		
	}

}
