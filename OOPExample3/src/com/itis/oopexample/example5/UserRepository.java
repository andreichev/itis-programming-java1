package com.itis.oopexample.example5;

public abstract class UserRepository {
    abstract void save(User user);
    abstract User findByName(String name);
}
