package com.bank.dao;

import com.core.models.Profil;

public interface IProfil extends IDao<Profil, Long>{

	public void add(Profil p, long idclient);
	public Profil auth(String username, String pass);
}
