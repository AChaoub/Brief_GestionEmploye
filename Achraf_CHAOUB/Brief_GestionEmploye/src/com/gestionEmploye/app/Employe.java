package com.gestionEmploye.app;

public abstract class Employe {
	
	private String nom;
	private double salaireMensuel; 
	
	public Employe(String nom) {
		this.nom = nom;
		this.salaireMensuel = 0;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getSalaireMensuel() {
		return salaireMensuel;
	}

	public void setSalaireMensuel(double salaireMensuel) {
		this.salaireMensuel = salaireMensuel;
	}

	@Override
	public String toString() {
		return "Nom : " + nom ;
	}
	
	
	

}
