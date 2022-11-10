package ru.itis.programs.sandbox;

import java.util.Optional;

public class Sandbox {
    public static void main(String[] args) {
        Konura konura = new Konura();

        Optional<Dog> optionalDog = konura.getDog();
        if (optionalDog.isEmpty()) {
            System.out.println("NO DOG");
        } else {
            System.out.println(optionalDog.get().name);
        }
    }
}
