package hospital;

import interfaces.CanDrawBlood;

public class Surgeon extends Doctor implements CanDrawBlood {
	
	private String pay;

	public String getPay() {
		return pay;
	}

	public Surgeon(String name, String title, String idNumber) {
		super(name, title, idNumber);		
		this.pay = "$120,000.00";
	}
	
	@Override
	public void drawBlood(Patient patient) {
		patient.drawSomeBlood(10);
	}
	
	public void performSurgery(Patient patient) {
		patient.performSurgery(1, 1);
	}
}
