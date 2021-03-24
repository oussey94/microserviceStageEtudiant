package com.mbodjiousseynou.StagesEtudiant.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Stage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private String nomEntreprise;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNomEntreprise() {
		return nomEntreprise;
	}
	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}
	public Stage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Stage(Long id, String nom, String prenom, String nomEntreprise) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.nomEntreprise = nomEntreprise;
	}
	@Override
	public String toString() {
		return "Stage [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", nomEntreprise=" + nomEntreprise + "]";
	}
	

}
