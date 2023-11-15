package com.itis.oopexample.example5;

public class UserRepositoryDBImpl extends UserRepository {
    @Override
    void save(User user) {
        System.out.println("User " + user.name + "saved to database");
    }

    @Override
    User findByName(String name) {
        return null;
    }
}
