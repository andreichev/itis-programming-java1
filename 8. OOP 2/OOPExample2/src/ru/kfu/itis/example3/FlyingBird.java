package ru.kfu.itis.example3;

abstract class FlyingBird extends Bird {
    @Override
    void fly() {
        System.out.println(getName() + " IS FLYING");
    }
}
