package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {
    private UserList users;

    @BeforeEach
    void init() {
        users = new UserList();
    }

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        users.addUser("AAA", "1234");
        users.addUser("BBB", "1234");
        users.addUser("CCC", "1234");

        // TODO: find one of them
        User user = users.findUserByUsername("AAA");

        // TODO: assert that UserList found User
        String expected = "AAA";
        String actual = user.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        users.addUser("AAA", "888Patiphan");
        users.addUser("BBB", "PPP1234");
        users.addUser("CCC", "JJ23JJ");

        // TODO: change password of one user
        // TODO: assert that user can change password
        assertTrue(users.changePassword("BBB", "PPP1234", "KKKK13344"));
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        users.addUser("AAA", "888Patiphan");
        users.addUser("BBB", "PPP1234");
        users.addUser("CCC", "JJ23JJ");

        // TODO: call login() with correct username and password
        User u = users.login("CCC", "JJ23JJ");

        // TODO: assert that User object is found
        assertEquals(u.getUsername(), "CCC");
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        users.addUser("AAA", "888Patiphan");
        users.addUser("BBB", "PPP1234");
        users.addUser("CCC", "JJ23JJ");

        // TODO: call login() with incorrect username or incorrect password
        assertNull(users.login("CCC", "oirjoqijior"));

        // TODO: assert that the method return null
    }

}