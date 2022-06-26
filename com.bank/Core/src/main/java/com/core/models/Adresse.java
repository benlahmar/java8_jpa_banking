/**
 * 
 */
package com.core.models;

import javax.persistence.Embeddable;

/**
 * @author moi
 *
 */
@Embeddable
public class Adresse {

	public String rue, ville,pays,codepostale;

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getCodepostale() {
		return codepostale;
	}

	public void setCodepostale(String codepostale) {
		this.codepostale = codepostale;
	}
	
	
}
