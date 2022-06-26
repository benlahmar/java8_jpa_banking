package com.core.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Profil.auth2",query = " from Profil p where p.username=:u and p.password=:p")
public class Profil {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	String username;
	String password;
	
	LocalDate date;
	
	@ManyToMany(mappedBy = "profils",fetch = FetchType.EAGER )
	
	List<Role> roles=new ArrayList<>();
	
	@ManyToOne(cascade = CascadeType.ALL)
	Client client;
	
	
	
	
	public Profil(String username, String password, LocalDate date) {
		super();
		this.username = username;
		this.password = password;
		this.date = date;
	}
	public Profil() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	
	
}
