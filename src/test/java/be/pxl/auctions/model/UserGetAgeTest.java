package be.pxl.auctions.model;

import be.pxl.auctions.dao.UserDao;
import be.pxl.auctions.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;



import java.time.LocalDate;

public class UserGetAgeTest {
	private static final long USER_ID = 5L;
	private static final long DAYOFSET = 1L;
	private int years = 31;
	@Mock
	private UserDao userDao;
	@InjectMocks
	private UserService userService;
	private User user;

	@BeforeEach
	public void init() {
		user = new User();
		user.setId(USER_ID);
		user.setFirstName("Mark");
		user.setLastName("Zuckerberg");
		user.setDateOfBirth(LocalDate.of(1989, 5, 3));
		user.setEmail("mark@facebook.com");
	}

	@Test
	public void returnsCorrectAgeWhenHavingBirthdayToday() {
		assertEquals(years, user.getAge());
		// TODO implement test
	}

	@Test
	public void returnsCorrectAgeWhenHavingBirthdayTomorrow() {
		user.setDateOfBirth(user.getDateOfBirth().plusDays(DAYOFSET));
		assertEquals(years, user.getAge());
		// TODO implement test
	}

	@Test
	public void returnsCorrectAgeWhenBirthdayWasYesterday() {
		user.setDateOfBirth(user.getDateOfBirth().minusDays(DAYOFSET));
		assertEquals(years, user.getAge());
		// TODO implement test
	}

}
