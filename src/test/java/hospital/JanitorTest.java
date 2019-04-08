package hospital;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class JanitorTest {

	Janitor testJanitor;

	@Before
	public void setup() {
		testJanitor = new Janitor("Tom", "654");
	}

	@Test
	public void shouldReturnPay() {

		testJanitor.getPay();

		assertEquals(testJanitor.getPay(), "$40,000.00");
	}

	@Test
	public void shouldReturnName() {

		testJanitor.getName();

		assertEquals(testJanitor.getName(), "Tom");
	}

	@Test
	public void shouldReturnTitle() {

		testJanitor.getTitle();

		assertEquals(testJanitor.getTitle(), "Janitor");
	}

	@Test
	public void shouldReturnIdNumber() {

		testJanitor.getIdNumber();

		assertEquals(testJanitor.getIdNumber(), "654");
	}

	@Test
	public void shouldSweep() {

		int cleanlinessBeforeSweep = testJanitor.getCleanliness();
		testJanitor.sweep();
		int cleanlinessAfterSweep = testJanitor.getCleanliness();

		assertEquals(cleanlinessAfterSweep, cleanlinessBeforeSweep - 5);
	}
}
