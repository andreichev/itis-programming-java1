package ru.itis.exceptions;

public class Bob implements Builder {
    @Override
    public void build() throws BuilderException {
        if(Math.random() > 0.5) {
            throw new BuilderException("Нет кирпичей");
        }
        System.out.println("House built");
    }
}
