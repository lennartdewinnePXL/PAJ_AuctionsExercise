package be.pxl.auctions.service;

import be.pxl.auctions.dao.UserDao;
import be.pxl.auctions.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
public class UserServiceCreateUserTest {
    private static final long USER_ID = 5L;

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
	// TODO add unit tests for all possible scenario's of the createUser method
}
