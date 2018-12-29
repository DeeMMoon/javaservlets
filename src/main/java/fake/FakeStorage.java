package fake;

import models.User;

import java.util.ArrayList;
import java.util.List;

public class FakeStorage {
    private static final FakeStorage storage;
    static {
        storage = new FakeStorage();
    }
    private List<User> users;
    private FakeStorage(){
        this.users = new ArrayList<>();
        User user = new User("Dima", "qwerty");
        User user2 = new User("OLEG", "qwerty22");
        User user3 = new User("piu", "qwerty33");
        users.add(user);
        users.add(user2);
        users.add(user3);
    }
    public static FakeStorage storage(){
        return storage;
    }
    public List<User> users(){
        return users;
    }
}
