package ru.itis.exceptions_example.work;

import ru.itis.exceptions_example.work.model.PersonException;

public interface Person {
    Product doWork() throws PersonException;
}
