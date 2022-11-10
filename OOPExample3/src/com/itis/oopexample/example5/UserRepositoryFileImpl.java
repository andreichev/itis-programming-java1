package com.itis.oopexample.example5;

public class UserRepositoryFileImpl extends UserRepository {
    @Override
    void save(User user) {
        System.out.println("User " + user.name + "saved to file");
    }

    @Override
    User findByName(String name) {
        return null;
    }
}
