package com.itis.oopexample.example3;

public class Hamster implements Pet {
    @Override
    public String getName() {
        return "Pupik";
    }

    @Override
    public void voice() {
        System.out.println("...");
    }
}
