package com.gestionEmploye.app;

public class EmployeHoraire extends Employe {
	
	private int heure ; 
	private double taux;
	
	public EmployeHoraire(String nom,int heure , double taux) {
		super(nom);
		this.heure = heure;
		this.taux  = taux;
		super.setSalaireMensuel(heure*taux);
	}
	
	
	
	public int getHeure() {
		return heure;
	}



	public void setHeure(int heure) {
		this.heure = heure;
	}



	public double getTaux() {
		return taux;
	}



	public void setTaux(double taux) {
		this.taux = taux;
	}



	@Override
	public String toString() {
		return "Nom : " + getNom() +"\n\tsalaireMensuel(taux  * heure de travail) : "+getTaux() +" * "+ getHeure() + " = " + getSalaireMensuel() + " DHS\ns";
	}
	

}
