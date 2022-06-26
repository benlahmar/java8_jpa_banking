/**
 * 
 */
package com.bank.dao;

/**
 * @author moi
 *
 */
public class UnitOfWork implements IUnitOfWork {

	IClient cdao;
	IRole rdao;
	IProfil pdao;
	@Override
	public IClient getcdao() {
		// TODO Auto-generated method stub
		return cdao;
	}

	@Override
	public IRole getrdao() {
		// TODO Auto-generated method stub
		return rdao;
	}

	@Override
	public IProfil getpdao() {
		// TODO Auto-generated method stub
		return pdao;
	}

}
