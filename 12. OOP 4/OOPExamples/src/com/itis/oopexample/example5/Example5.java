package com.itis.oopexample.example5;

public class Example5 {
    public static void main(String[] args) {
        UserRepositoryFileImpl userRepository = new UserRepositoryFileImpl();

        //
        userRepository.findByName("Ivan");
        userRepository.save(new User());
    }
}
