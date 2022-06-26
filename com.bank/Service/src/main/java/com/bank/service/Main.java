package com.bank.service;


import com.bank.dao.IClient;
import com.bank.service.factory.ClientDaoFactory;

public class Main {

	public static void main(String[] args) {
		String dao="";
		ClientDaoFactory cf=new ClientDaoFactory();
		
		IClient cdao=cf.getClientDao(dao);
		
		//cdao=cf.getClientDao("xml");
		
		ServiceImpl service=new ServiceImpl(cdao);
		//new , obj methode, factory  
		
		//service.addClient(c);
	}

}
