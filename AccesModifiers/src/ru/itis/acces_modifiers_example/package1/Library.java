package ru.itis.acces_modifiers_example.package1;

// PUBLIC - виден везде
// PROTECTED - только для полей. видимость только в унаследованном классе
// DEFAULT - виден в своем пакете
// PRIVATE - виден только внутри класса

public class Library {
    protected void func() {
        System.out.println("HELLO");
    }
}
