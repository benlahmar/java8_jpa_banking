/**
 * 
 */
package com.core.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import org.hibernate.annotations.IndexColumn;

/**
 * @author moi
 *
 */
@Entity
@Table(name = "clients")
public class Client {
   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_client")
	public long id;
	@Column(name = "name", length = 255,nullable = false)
	public String nom;
	@Column(unique = true)
	public String email;
	
	@ElementCollection
	@OrderColumn
	public String[] prenoms;//
	
	@Embedded
	public Adresse adresse;
	
	@OneToMany(mappedBy = "client", 
			cascade = CascadeType.ALL)
	List<Profil> profiles=new ArrayList<>();
	
	@OneToMany(mappedBy = "client", 
			cascade = CascadeType.ALL)
	List<Compte> compte=new ArrayList<>();
	
	
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String[] getPrenoms() {
		return prenoms;
	}
	public void setPrenoms(String[] prenoms) {
		this.prenoms = prenoms;
	}
	public List<Profil> getProfiles() {
		return profiles;
	}
	public void setProfiles(List<Profil> profiles) {
		this.profiles = profiles;
	}
	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", email=" + email + ", prenoms=" + Arrays.toString(prenoms)
				+ ", adresse=" + adresse + ", profiles=" + profiles + "]";
	}
	

	
	
	
	
}
