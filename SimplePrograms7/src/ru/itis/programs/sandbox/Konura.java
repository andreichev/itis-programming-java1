package ru.itis.programs.sandbox;

import java.util.Optional;

public class Konura {
    private Optional<Dog> dog;

    void addDog(Dog dog) {
        this.dog = Optional.of(dog);
    }

    Optional<Dog> getDog() {
        return dog;
    }
}
