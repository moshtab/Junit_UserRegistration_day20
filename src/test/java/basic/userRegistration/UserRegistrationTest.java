package basic.userRegistration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {
	UserRegistration myobj;

	@Before
	public void initialize() {
		myobj = new UserRegistration();

	}

	@Test
	public void shouldReturnTheFirstCharacterOfFirstNameInCapitalAndLengthGreaterThanTwo() {
		assertEquals("Mohammad", myobj.firstName("Mohammad"));

	}

	@Test
	public void shouldReturnTheFirstCharacterOfLastNameInCapitalAndLengthGreaterThanTwo() {
		assertEquals("Mohsin", myobj.lastName("Mohsin"));

	}
	@Test
	public void shouldReturnTrueIfEmailIsValid() {
		assertTrue(myobj.validateEmailId("mdmohsin41439@gmail.com"));
	}
	
	@Test
	public void shouldReturnTrueIfMobileNumberIsValid() {
		assertTrue(myobj.validateMobileNumberId("91 9908514276"));
	}
	
	@Test
	public void shouldReturnTrueIfPasswordIsValid() {
		assertTrue(myobj.validatePasswordId("Md78678#"));
	}
	

}
