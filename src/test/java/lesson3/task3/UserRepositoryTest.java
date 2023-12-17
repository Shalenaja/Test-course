package lesson3.task3;

import junit.framework.TestCase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserRepositoryTest extends TestCase {

private UserRepository repository;
    @Test
    @DisplayName("testNotAuthenticate - remove authenticate all users except admins")
    public void testNotAuthenticate() {
        repository = new UserRepository();
        User user1 = new User("user1", "659", false);
        User user2 = new User("user2", "989", false);
        User admin1 = new User("admin1", "123", true);
        User admin2 = new User("admin2", "234", true);
        repository.addUser(user1);
        repository.addUser(user2);
        repository.addUser(admin1);
        repository.addUser(admin2);

        repository.notAuthenticate();

        assertEquals(2, repository.adminNumber());
    }
}