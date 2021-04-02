package be.pxl.auctions.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class EmailValidatorIsValidTest {

	@Test
	public void returnsTrueWhenValidEmail() {
		assertTrue(EmailValidator.isValid("lennartdewinne@gmail.com"));
		// TODO implement test
	}

	@Test
	public void returnsFalseWhenAtSignMissing() {
		assertFalse(EmailValidator.isValid("lennartdewinnegmail.com"));
		// TODO implement test
	}

}
