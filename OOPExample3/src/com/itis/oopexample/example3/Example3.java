package com.itis.oopexample.example3;

public class Example3 {
    public static void main(String[] args) {
        // Создание анонимного класса
        Pet cat = new Pet() {
            @Override
            public String getName() {
                return "Денди";
            }

            @Override
            public void voice() {
                System.out.println("Мяу");
            }
        };

        Pet dog = new Pet() {
            @Override
            public String getName() {
                return "Бобик";
            }

            @Override
            public void voice() {
                System.out.println("Гав");
            }
        };

        Pet[] pets = { cat, dog };

        for (int i = 0; i < pets.length; i++) {
            pets[i].voice();
        }
    }
}
