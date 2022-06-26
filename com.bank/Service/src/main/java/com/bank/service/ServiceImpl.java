/**
 * 
 */
package com.bank.service;

import java.util.List;

import com.bank.dao.ClientDaoJpa;
import com.bank.dao.IClient;
import com.bank.dao.IProfil;
import com.bank.dao.IRole;
import com.bank.dao.IUnitOfWork;
import com.core.models.Client;
import com.core.models.Profil;
import com.core.models.Role;

/**
 * @author moi
 *
 */
public class ServiceImpl implements IService{

	//1 comment declarer Dao
	IClient cdao;
	IRole rdao;
	IProfil pdao;
	
	
	//IUnitOfWork uow;
	
	public ServiceImpl(IClient cdao,IRole rdao,IProfil pdao ) {
		
		this.cdao = cdao;
		this.rdao=rdao;
		this.pdao=pdao;
	}

	
	
	public ServiceImpl(IClient cdao) {
		super();
		this.cdao = cdao;
	}



	@Override
	public void addClient(Client c) {
		//uow.getcdao().add(c);
		cdao.add(c);
		
	}

	@Override
	public void AddRole(Role r) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addProfile(Profil p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Client> allClients() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Role> allRoles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Profil> allProfils() {
		// TODO Auto-generated method stub
		return null;
	}

}
