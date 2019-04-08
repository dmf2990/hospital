package hospital;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class VampireJanitorTest {

	VampireJanitor testVampireJanitor;

	@Before
	public void setup() {
		testVampireJanitor = new VampireJanitor("Vlad", "321", "");
	}

	@Test
	public void shouldReturnPay() {

		testVampireJanitor.getPay();

		assertEquals(testVampireJanitor.getPay(), "$40,000.00");
	}

	@Test
	public void shouldReturnName() {

		testVampireJanitor.getName();

		assertEquals(testVampireJanitor.getName(), "Vlad");
	}

	@Test
	public void shouldReturnTitle() {

		testVampireJanitor.getTitle();

		assertEquals(testVampireJanitor.getTitle(), "Vampire Janitor");
	}

	@Test
	public void shouldReturnIdNumber() {

		testVampireJanitor.getIdNumber();

		assertEquals(testVampireJanitor.getIdNumber(), "321");
	}

	@Test
	public void shouldSweep() {

		int cleanlinessBeforeSweep = testVampireJanitor.getCleanliness();
		testVampireJanitor.sweep();
		int cleanlinessAfterSweep = testVampireJanitor.getCleanliness();

		assertEquals(cleanlinessAfterSweep, cleanlinessBeforeSweep - 5);
	}
	
	@Test
	public void shouldDrawBlood() {
	
	int bloodLevelBeforeDrawBlood = testVampireJanitor.getBloodLevel();
	testVampireJanitor.drawBlood();
	int bloodLevelAfterDrawBlood = testVampireJanitor.getBloodLevel();
	
	assertEquals(bloodLevelAfterDrawBlood, bloodLevelBeforeDrawBlood -1);
	}
}
