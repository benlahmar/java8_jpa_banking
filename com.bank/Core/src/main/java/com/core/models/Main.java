/**
 * 
 */
package com.core.models;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author moi
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("unitdao");
		EntityManager em = emf.createEntityManager();
//		Client c=new Client();
//		c.setNom("ahmed");
//		c.setEmail("email_14");
//		String[] prenoms= {"mohamed","ali"};
//		c.setPrenoms(prenoms);
//		Adresse ad=new Adresse();
//		ad.setVille("casa");;ad.setRue("rue");
//		ad.setCodepostale("10000");ad.setPays("ma");
//		c.setAdresse(ad);
//		
//		LocalDate date=LocalDate.now();
//		
//		Profil p1=new Profil("moi", "pass", date);
//		Profil p2=new Profil("toi", "pass", date);
//		p1.setClient(c);p2.setClient(c);
//		
//		c.getProfiles().add(p1);
//		c.getProfiles().add(p2);
//		
//		em.getTransaction().begin();
//		em.persist(c);
//		em.getTransaction().commit();
//		em.close();
//		
//		Client c1=em.find(Client.class, 11L);
//		c1.getProfiles().forEach(x-> System.out.println(x.getUsername()));
//		System.out.println(c1.toString());

		Role r=new Role();r.setLibelle("guest");
		em.getTransaction().begin();
		em.persist(r);
		
		
//		Profil p = em.find(Profil.class, 4L);
//		//p.getRoles().add(r);
//		
//		r.getProfils().add(p);
		
		em.getTransaction().commit();
		em.close();
		
	}

}
