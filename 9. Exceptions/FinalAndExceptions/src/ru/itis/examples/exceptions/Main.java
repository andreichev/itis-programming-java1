package ru.itis.examples.exceptions;

public class Main {
    public static void main(String[] args) {
        RegistrationForm form = new RegistrationForm("sddsf@mail.ru", "ddssdfdf");
        Validator validator = new Validator();
        try {
            validator.check(form);
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
            return;
        }
        // User registration
        System.out.println("Registered!");
    }
}
