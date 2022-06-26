package com.bank.dao;

import java.util.List;

import com.core.models.Role;

public interface IRole extends IDao<Role, Long>{

	public void addRole2Profil(long idrole, long idprofile);
	public void removeRole2Profile(long idrole, long idprofile);
	public List<Role> getRoles(long idprofile);
	
}
