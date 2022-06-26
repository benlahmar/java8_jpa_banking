package com.bank.dao;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.bank.dao.util.UtilEm;
import com.core.models.Client;
import com.core.models.Role;

public class RoleDao implements IRole{

	EntityManager em;
	
	
	public RoleDao() {
		super();
		em=UtilEm.getem("unitdao");
	}

	@Override
	public void add(Role t) {
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		em.close();
		
	}

	@Override
	public Role findById(Long id) {
		// TODO Auto-generated method stub
		return em.find(Role.class,id);
	}

	@Override
	public List<Role> all() {
		// TODO Auto-generated method stubQuery q = em.createQuery("from Client c ");
		Query q = em.createQuery("from Role");
		List<Role> ls = q.getResultList();
		return ls;
		
	}

	@Override
	public void delete(Role t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Role t, Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <E> List<E> findProp() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Role> findBycritere(Predicate<Role> condition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addRole2Profil(long idrole, long idprofile) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeRole2Profile(long idrole, long idprofile) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Role> getRoles(long idprofile) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void action(Consumer<Role> consumer, Role r) {
		
		consumer.accept(r);
		
	}

}
