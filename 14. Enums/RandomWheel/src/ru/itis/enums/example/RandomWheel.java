package ru.itis.enums.example;

public class RandomWheel {
    public static void main(String[] args) {
        AnswerVariant[] variants = AnswerVariant.getAll();

        int randomVariantIndex = (int) (Math.random() * variants.length);
        AnswerVariant selectedVariant = variants[randomVariantIndex];

        System.out.println(selectedVariant.color.code + selectedVariant.getRandomMessage());
    }
}
