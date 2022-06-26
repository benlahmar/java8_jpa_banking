/**
 * 
 */
package com.bank.dao;

import com.core.models.Client;
import com.core.models.Profil;
import com.core.models.Role;

/**
 * @author moi
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ClientDaoJpa dao=new ClientDaoJpa();
		Client t = dao.findById(3L);
		//dao.delete(t);
		
		
		
		dao.all().stream()
		.forEach(System.out::println);
		
		RoleDao daorole=new RoleDao();
		Role r = daorole.findById(1L);
		ProfileDaoJpa daop=new ProfileDaoJpa();
		Profil p = daop.findById(4L);
		
		daorole.action(x-> {
			x.getProfils().add(p);
			
			},
				r);
		daorole.action(x-> x.getProfils().remove(p), r);
		
	}

}
