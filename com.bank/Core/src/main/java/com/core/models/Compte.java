/**
 * 
 */
package com.core.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



/**
 * @author moi
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Compte {

	@Id
	@GeneratedValue
	long idcompte;
	double solde;
	double decouverte;
	
	@ManyToOne()
	Client client;
	
	@OneToMany(mappedBy = "compte",cascade = CascadeType.ALL)
	List<Operation> operations=new ArrayList<>();
	
	
	public long getIdcompte() {
		return idcompte;
	}
	public void setIdcompte(long idcompte) {
		this.idcompte = idcompte;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public double getDecouverte() {
		return decouverte;
	}
	public void setDecouverte(double decouverte) {
		this.decouverte = decouverte;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public List<Operation> getOperations() {
		return operations;
	}
	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}
	
	
	
	
}
