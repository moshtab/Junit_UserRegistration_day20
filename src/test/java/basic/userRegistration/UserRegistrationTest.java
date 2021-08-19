package basic.userRegistration;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {
	UserRegistration obj;

	@Before
	public void initialize() {
		obj = new UserRegistration();

	}

	@Test
	public void shouldReturnTheFirstCharacterOfFirstNameInCapitalAndLengthGreaterThanTwo() {
		assertEquals("Mohammad", obj.firstName("Mohammad"));

	}

	@Test
	public void shouldReturnTheFirstCharacterOfLastNameInCapitalAndLengthGreaterThanTwo() {
		assertEquals("Mohsin", obj.lastName("Mohsin"));

	}

}
