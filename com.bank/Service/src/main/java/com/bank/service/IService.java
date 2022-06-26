package com.bank.service;

import java.util.List;

import com.core.models.Client;
import com.core.models.Profil;
import com.core.models.Role;

public interface IService {

	public void addClient(Client c);
	public void AddRole(Role r);
	public void addProfile(Profil p);
	
	public List<Client> allClients();
	public List<Role> allRoles();
	public List<Profil> allProfils();
	
}
