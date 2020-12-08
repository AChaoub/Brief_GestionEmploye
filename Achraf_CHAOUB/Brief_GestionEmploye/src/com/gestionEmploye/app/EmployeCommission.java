package com.gestionEmploye.app;

public class EmployeCommission extends Employe {

	private int vente ; 
	private double commission;
	
	
	public EmployeCommission(String nom,int vente ,double  commission, double salaire) {
		super(nom);
		this.commission = commission;
		this.vente  = vente;
		super.setSalaireMensuel(salaire+(vente*commission/100));

	}


	public int getVente() {
		return vente;
	}


	public void setVente(int vente) {
		this.vente = vente;
	}


	public double getCommission() {
		return commission;
	}


	public void setCommission(double commission) {
		this.commission = commission;
	}
	
	@Override
	public String toString() {
		return "Nom : " + getNom() + "\n \tsalaireMensuel major� (+commission) = " + getSalaireMensuel()+ " DHS" + "\t cumul� de commission  : "+(getCommission()/100)*getVente()+ " DHS\n";
	}

	
	
	
	
}
