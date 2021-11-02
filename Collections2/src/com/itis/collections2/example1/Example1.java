package com.itis.collections2.example1;

// Object
// A (Object)
// B (A (Object))
// C (B (A (Object)))

public class Example1 {
    public static void main(String[] args) {
        A a = new A();
        a.x = 20;
        System.out.println(a);
    }
}
