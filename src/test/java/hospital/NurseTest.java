package hospital;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class NurseTest {

Nurse testNurse;
	
	@Before
	public void setup() {
		testNurse = new Nurse("Destiny", "Nurse", "789");
	}
	
	@Test
	public void shouldReturnPay() {
		
	testNurse.getPay();
	
	assertEquals(testNurse.getPay(), "$50,000.00");
	}
	
	@Test
	public void shouldReturnName() {
	
	testNurse.getName();
	
	assertEquals(testNurse.getName(), "Destiny");
	}
	
	@Test
	public void shouldReturnTitle() {
	
	testNurse.getTitle();
	
	assertEquals(testNurse.getTitle(), "Nurse");
	}
	
	@Test
	public void shouldReturnIdNumber() {
	
	testNurse.getIdNumber();
	
	assertEquals(testNurse.getIdNumber(), "789");
	
	}
	
	@Test
	public void shouldDrawBlood() {
	
	int bloodLevelBeforeDrawBlood = testNurse.getBloodLevel();
	testNurse.drawBlood();
	int bloodLevelAfterDrawBlood = testNurse.getBloodLevel();
	
	assertEquals(bloodLevelAfterDrawBlood, bloodLevelBeforeDrawBlood -1);
	}
	
	@Test
	public void shouldFeedPatient() {
	
	int hungerBeforeFeed = testNurse.getHunger();
	testNurse.feed();
	int hungerAfterFeed = testNurse.getHunger();
	
	assertEquals(hungerAfterFeed, hungerBeforeFeed + 5);
	}
	
	@Test
	public void shouldOrganizePaper() {
	
	int organizationBeforeOrganizePaper = testNurse.getOrganizationStatus();
	testNurse.organize();
	int organizationAfterOrgranizePaper = testNurse.getOrganizationStatus();
	
	assertEquals(organizationAfterOrgranizePaper, organizationBeforeOrganizePaper + 5);
	}
	
}

