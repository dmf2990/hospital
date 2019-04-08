package hospital;

import interfaces.CanDrawBlood;

public class VampireJanitor extends Janitor implements CanDrawBlood {

	private String pay;

	public String getPay() {
		return pay;
	}

	public VampireJanitor(String name, String title, String idNumber) {
		super(name, title, idNumber);
		this.pay = "$40,000.00";
	}

	public void drawBlood(Patient patient) {
		patient.drawSomeBlood(5); // correlates to i in patient bloodlevel method (care for patient same)\
	}

}
