package com.gestionEmploye.app;



public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*    //Pour La classe Non abstract 
		Employe emp = new Employe("CHAOUB");
		EmployeFixe emp1 = new EmployeFixe("AKRAM",5000);
		EmployeCommission emp2 = new EmployeCommission("SAM", 120000, 10, 10000);
		EmployeHoraire emp3 = new EmployeHoraire("JACK", 50, 100);
		
		System.out.println(emp.toString());
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		System.out.println(emp3.toString());
		 */
		
		
		// application classe Abstract(EMPLOYE)
		
		Employe emp1 = new EmployeFixe("CHAOUB",5000);
		System.out.println(emp1.toString());
		
		Employe emp2 = new EmployeCommission("SAM", 120000, 10, 10000);
		System.out.println(emp2.toString());
		
		Employe emp3 = new EmployeHoraire("JACK", 50, 100);
		System.out.println(emp3.toString());
		
		
		
		
	}

}
