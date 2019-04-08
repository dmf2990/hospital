package hospital;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DoctorTest {

	Doctor testDoctor;
	
	@Before
	public void setup() {
		testDoctor = new Doctor("Steve", "Doctor", "456");
	}
	
	@Test
	public void shouldReturnPay() {
		
	testDoctor.getPay();
	
	assertEquals(testDoctor.getPay(), "$90,000.00");
	}
	
	@Test
	public void shouldReturnName() {
	
	testDoctor.getName();
	
	assertEquals(testDoctor.getName(), "Steve");
	}
	
	@Test
	public void shouldReturnTitle() {
	
	testDoctor.getTitle();
	
	assertEquals(testDoctor.getTitle(), "Doctor");
	}
	
	@Test
	public void shouldReturnIdNumber() {
	
	testDoctor.getIdNumber();
	
	assertEquals(testDoctor.getIdNumber(), "456");
	}
	
	@Test
	public void shouldPerformTreatPatient() {
	
	int healthBeforeTreatPatient = testDoctor.getHealth();
	testDoctor.treatPatient();
	int healthAfterTreatPatient = testDoctor.getHealth();
	
	assertEquals(healthAfterTreatPatient, healthBeforeTreatPatient +1);
	}
	
	@Test
	public void shouldDrawBlood() {
	
	int bloodLevelBeforeDrawBlood = testDoctor.getBloodLevel();
	testDoctor.drawBlood();
	int bloodLevelAfterDrawBlood = testDoctor.getBloodLevel();
	
	assertEquals(bloodLevelAfterDrawBlood, bloodLevelBeforeDrawBlood -1);
	}
}
