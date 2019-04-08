package hospital;

import interfaces.CanOrganize;

public class Receptionist extends Employee implements CanOrganize {

	private String pay;

	public String getPay() {
		return pay;
	}
	
	public Receptionist(String name, String title, String idNumber) {
		super(name, title, idNumber); 
		this.pay = "$45,000.00";
	}

	public void organize(Hospital hospital) {
		hospital.organize(5);
	}
}
