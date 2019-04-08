package hospital;

public class Janitor extends Employee {
	
	private String pay;

	public String getPay() {
		return pay;	
	}
	
	public Janitor(String name, String title, String idNumber) {
		super(name, title, idNumber); 
		this.pay = "$40,000.00";
	}

	public void sweep(Hospital hospital) {
		hospital.cleanliness(5);
	}

}
