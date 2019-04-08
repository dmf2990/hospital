package hospital;

import java.util.Collection;
import java.util.HashMap;



public class Hospital {
	//hospital class info
	private int cleanliness;
	private int organization;

	public int getCleanliness() {
		return cleanliness;
	}

	public int getOrganization() {
		return organization;
	}

	public Hospital(int cleanliness, int organize) {
		this.cleanliness = cleanliness;
		this.organization = organize;
	}

	public void cleanliness(int cleanlinessAfterClean) {
		cleanliness += cleanlinessAfterClean;
	}

	public void organize(int OrganizationAfterOrganize) {
		organization += OrganizationAfterOrganize;
	}

	@Override
	public String toString() {
		return "Hospital cleanliness=" + cleanliness + "\norganization=" + organization;
	}

	// HashMap Starts below
	static HashMap<String, Patient> patientList = new HashMap<String, Patient>();
	static HashMap<String, Employee> employeeList = new HashMap<String, Employee>();

	//patient
	public void addPatient(Patient patient) {
		patientList.put(patient.getIdNumber(), patient);
	}

	public void removePatient(Patient patient) {
	patientList.remove(patient.getIdNumber(), patient);
	}

	public Patient getPatient(String patientToGet) {
		return patientList.get(patientToGet);
	}

	public Collection<Patient> getPatientStatList() {
		return patientList.values();
	}
	

	public void drawAllPatientBlood() {
		for (Patient patientList : patientList.values())
			patientList.drawSomeBlood(5);
	}

	public void treatAllPatients() {
		for (Patient patientList : patientList.values())
			patientList.treatCurrentPatient(5);
	}

	public void feedAllPatients() {
		for (Patient patientList : patientList.values())
			patientList.satisfyHunger(10);
	}

	public void tickPatient() {
		for (Patient patientList : patientList.values()) {
			patientList.tick();

		}
	}
	//employee
	public void addEmployee(Employee employee) {
		employeeList.remove(employee.getIdNumber(), employee);
	}

	public void removeEmployee(Employee employee) {
		employeeList.remove(employee.getIdNumber(), employee);
	}
	
	public Employee getEmployee(String employeeToGet) {
		return employeeList.get(employeeToGet);
	}
	
	public Collection<Employee> getEmployeeStatList() {
		return employeeList.values();
	}
	//hospital
	public void tickHosptial() {
		cleanliness -= 1;
		organization -= 1;
	}

	public String getAllHosptialStats() {
		return "\nCleanliness=" + cleanliness + "\nOrganization Level=" + organization;
	}

}
