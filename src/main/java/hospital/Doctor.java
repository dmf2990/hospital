package hospital;

import interfaces.CanDrawBlood;

public class Doctor extends Employee implements CanDrawBlood {
	
	private String pay;

	
	public String getPay() {
		return pay;
	}


	
	public Doctor(String name, String title, String idNumber) {
		super(name, title, idNumber);
		this.pay = "$90,000.00";

		}
	
	public void treatPatient(Patient patient) {
		patient.treatCurrentPatient(5);	
	}

	
	public void drawBlood(Patient patient) {
		patient.drawSomeBlood(5); 
	}
}




