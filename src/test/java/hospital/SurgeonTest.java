package hospital;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SurgeonTest {

	Surgeon testSurgeon;
	
	@Before
	public void setup() {
		testSurgeon = new Surgeon("Tim", "Surgeon", "123");
	}
	
	@Test
	public void shouldReturnPay() {
		
	testSurgeon.getPay();
	
	assertEquals(testSurgeon.getPay(), "$120,000.00");
	}
	
	@Test
	public void shouldReturnName() {
	
	testSurgeon.getName();
	
	assertEquals(testSurgeon.getName(), "Tim");
	}
	
	@Test
	public void shouldReturnTitle() {
	
	testSurgeon.getTitle();
	
	assertEquals(testSurgeon.getTitle(), "Surgeon");
	}
	
	@Test
	public void shouldReturnIdNumber() {
	
	testSurgeon.getIdNumber();
	
	assertEquals(testSurgeon.getIdNumber(), "123");
	}
	
	@Test
	public void shouldPerformTreatPatient() {
	
	int healthBeforeTreatPatient = testSurgeon.getHealth();
	testSurgeon.treatPatient();
	int healthAfterTreatPatient = testSurgeon.getHealth();
	
	assertEquals(healthAfterTreatPatient, healthBeforeTreatPatient +1);
	}
	
	@Test
	public void shouldDrawBlood() {
	
	int bloodLevelBeforeDrawBlood = testSurgeon.getBloodLevel();
	testSurgeon.drawBlood();
	int bloodLevelAfterDrawBlood = testSurgeon.getBloodLevel();
	
	assertEquals(bloodLevelAfterDrawBlood, bloodLevelBeforeDrawBlood -1);
	}
	
	@Test
	public void shouldPerformSurgery() {
	
	int healthBeforeSurgery = testSurgeon.getHealth();
	testSurgeon.performSurgery();
	int healthAfterSurgery = testSurgeon.getHealth();
	
	assertEquals(healthAfterSurgery, healthBeforeSurgery -1);
	}
	
}
