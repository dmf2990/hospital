package hospital;

import interfaces.CanDrawBlood;
import interfaces.CanOrganize;

public class Nurse extends Employee implements CanOrganize, CanDrawBlood {

	private String pay;
	private int organizationStatus;

	public String getPay() {
		return pay;
	}

	public int getOrganizationStatus() {
		return organizationStatus;
	}

	public Nurse(String name, String title, String idNumber) {
		super(name, title, idNumber);
		this.pay = "$50,000.00";

		this.organizationStatus = 5;
	}
	public void drawBlood(Patient patient) {
		patient.drawSomeBlood(5); 
	//correlates to i in patient bloodlevel method (care for patient same
	}

	public void feed(Patient patient) {
		patient.satisfyHunger(10);
	}
	
	public void organize(Hospital hospital) {
		hospital.organize(5);
	}
}
