package hospital;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ReceptionistTest {
	
	Receptionist testReceptionist;
	
	@Before
	public void setup() {
		testReceptionist = new Receptionist("", "");
	}

	@Test
	public void shouldReturnPay() {
		
	testReceptionist.getPay();
	
	assertEquals(testReceptionist.getPay(), "$45,000.00");
	}
	
	@Test
	public void shouldReturnName() {
	
	testReceptionist.getName();
	
	assertEquals(testReceptionist.getName(), "Jillian");
	}
	
	@Test
	public void shouldReturnTitle() {
	
	testReceptionist.getTitle();
	
	assertEquals(testReceptionist.getTitle(), "Receptionist");
	}
	
	@Test
	public void shouldReturnIdNumber() {
	
	testReceptionist.getIdNumber();
	
	assertEquals(testReceptionist.getIdNumber(), "765");
	}
	
	@Test
	public void shouldOrganizePaper() {
	
	int organizationBeforeOrganizePaper = testReceptionist.getOrganizationStatus();
	testReceptionist.organize();
	int organizationAfterOrgranizePaper = testReceptionist.getOrganizationStatus();
	
	assertEquals(organizationAfterOrgranizePaper, organizationBeforeOrganizePaper + 5);
	}
}
