package isp.lab6.exercise3;

import java.util.ArrayList;
import java.util.Objects;

public class LoginSystem {
    private ArrayList<User> users = new ArrayList<>();
    private OnlineStore store;

    public boolean login(String username, String password) {
        for (User user : users) {
            if (Objects.equals(user.getUsername(), username) && Objects.equals(user.getPassword(), password)) {
                return true;
            }
        }
        return false;
    }

    public boolean logout(String username) {
        for (User user : users) {
            if (Objects.equals(user.getUsername(), username)) {
                store.removeSession(username);
                return true;
            }
        }
        return false;
    }

    public boolean register(String username, String password) {
        for (User user : users) {
            if ((Objects.equals(user.getUsername(), username) && Objects.equals(user.getPassword(), password))) {
                return false;
            }
        }
            User user = new User();
            user.setPassword(password);
            user.setUsername(username);
            users.add(user);
            return true;

    }
}
