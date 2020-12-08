package com.gestionEmploye.app;

public class EmployeFixe extends Employe {
	
	public EmployeFixe(String nom,double salaire) {
		super(nom);
		super.setSalaireMensuel(salaire);
	}

	
	
	@Override
	public String toString() {
		return "Nom : " + getNom() + ", salaireMensuel = " + getSalaireMensuel()+ " DHS\n";
	}

	

	
}
