package br.com.example.graphqljava.repository;

import br.com.example.graphqljava.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    private final List<User> users;

    public UserRepository() {
        users = new ArrayList<>();
        users.add(new User(1, "daniel.queiroz", "test123", 1));
        users.add(new User(2, "daniel.araujo", "test321", 2));
    }

    public List<User> findUsers() {
        return users;
    }
}
