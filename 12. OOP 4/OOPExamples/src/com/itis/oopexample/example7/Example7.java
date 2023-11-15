package com.itis.oopexample.example7;

public class Example7 {
    public static void main(String[] args) {
        Application application = Application.shared;
        application.start();
        application.loadLevel("FIRST LEVEL");
        application.quit();
    }
}
