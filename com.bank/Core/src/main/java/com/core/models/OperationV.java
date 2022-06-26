package com.core.models;

import javax.persistence.Entity;

@Entity
public class OperationV extends Operation{

	double mntv;

	
	public double getMntv() {
		return mntv;
	}

	public void setMntv(double mntv) {
		this.mntv = mntv;
	}
	
	
}
