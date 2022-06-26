/**
 * 
 */
package com.bank.dao.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author moi
 *
 */
public class UtilEm {

	static EntityManagerFactory emf;
	static EntityManager em;
	public static EntityManager getem(String nom)
	{
		 emf=Persistence.createEntityManagerFactory(nom);
		 em = emf.createEntityManager();
		return em;
	}
}
