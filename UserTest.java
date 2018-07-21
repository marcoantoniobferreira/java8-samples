import java.util.*;
/**
 * @author Marco Ferreira <marcoantoniobferreira@gmail.com>
 */
public class UserTest{
    public static void main(String[] args) {
        User user1 = new User("Marco Ferreira", 150);
        User user2 = new User("Joshua Block", 160);
        User user3 = new User("James Gosling", 220);
        List<User> users = Arrays.asList(user1, user2, user3);
        for (User u : users) {
            System.out.println(u.getName());
        }    
    }
}