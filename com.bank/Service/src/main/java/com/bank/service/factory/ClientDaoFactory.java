package com.bank.service.factory;

import com.bank.dao.ClientDaoJpa;
import com.bank.dao.ClientDaoXml;
import com.bank.dao.IClient;

public class ClientDaoFactory implements IDaoFactory{

	IClient ic;
	@Override
	public IClient getClientDao(String nom) {
		
		String key="";
		switch (key) {
		case "jpa":
			ic= new ClientDaoJpa();
			break;
		case "xml":
			ic=new ClientDaoXml();
		default:
			break;
		}
		
		return ic;
	}

}
