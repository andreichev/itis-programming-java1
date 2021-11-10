package ru.kfu.itis.example1;

//     A (abstract)  B (abstract)  C
// f1  -             +             -
// f2  -             -             +
// f3  -             +             -

public class C extends B {
    @Override
    public void f2() {
        System.out.println(2);
    }
}
