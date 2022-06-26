package com.core.models;

import javax.persistence.Entity;

@Entity
public class OperationR extends Operation{

	double mntr;

	
	public double getMntr() {
		return mntr;
	}

	public void setMntr(double mntr) {
		this.mntr = mntr;
	}
	
	
}
