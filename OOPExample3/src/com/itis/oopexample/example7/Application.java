package com.itis.oopexample.example7;

public class Application {
    static Application shared = new Application();

    private Application() {}

    void start() {
        System.out.println("APP STARTED");
    }

    void loadLevel(String levelName) {
        System.out.println("LEVEL " + levelName + " LOADED");
    }

    void quit() {
        System.out.println("APP FINISHED");
    }
}
