package com.bank.service.factory;

import com.bank.dao.IClient;

public interface IDaoFactory {

	public  IClient getClientDao(String nom);
	
}
