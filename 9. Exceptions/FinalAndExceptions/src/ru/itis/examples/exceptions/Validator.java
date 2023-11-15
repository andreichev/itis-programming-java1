package ru.itis.examples.exceptions;

public class Validator {
    void check(RegistrationForm registrationForm) throws ValidationException {
        if(registrationForm.email.isEmpty() || registrationForm.email.lastIndexOf("@") == -1) {
            throw new ValidationException("Email is not correct");
        }
        if(registrationForm.password.isEmpty() || registrationForm.password.length() < 5) {
            throw new ValidationException("Password is not correct");
        }
    }
}
