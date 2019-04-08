package hospital;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PatientTest {

	Patient testPatient;

	@Before
	public void setup() {
		testPatient = new Patient("Sam");
	}

	@Test
	public void patientMustHaveHealth() {
		testPatient.getHealth();

		assertEquals(testPatient.getHealth(), 10);
	}
	
	@Test 
	public void patientMustHaveBloodLevel() {
		testPatient.getBloodLevel();

		assertEquals(testPatient.getBloodLevel(), 20);
	}
	
	@Test
	public void patientMustHaveHunger() {
		testPatient.getHunger();

		assertEquals(testPatient.getHunger(), 10);
	}

}
