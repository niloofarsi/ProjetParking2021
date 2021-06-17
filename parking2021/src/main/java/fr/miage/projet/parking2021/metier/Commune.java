package fr.miage.projet.parking2021.metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="commune")
public class Commune {
	@Column(name ="numCommune")
	private int numCommune;
	
	@Column(name ="nomCommune")
	private String nomCommune="";
	
	@Column(name = "codePostal")
	private int codePostal;
	
	public Commune() {
		
	}

	public int getNumCommune() {
		return numCommune;
	}

	public void setNumCommune(int numCommune) {
		this.numCommune = numCommune;
	}

	public String getNomCommune() {
		return nomCommune;
	}

	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	@Override
	public String toString() {
		return "Commune [numCommune=" + numCommune + ", nomCommune=" + nomCommune + ", codePostal=" + codePostal + "]";
	}
	
	

	
}
