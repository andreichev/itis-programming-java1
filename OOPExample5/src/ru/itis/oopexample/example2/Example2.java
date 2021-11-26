package ru.itis.oopexample.example2;

// Object
// A (Object)
// B (A (Object))
public class Example2 {
    public static void main(String[] args) {
        A link1 = new A(10);
        B link2 = new B(1);

        
        System.out.println(link1.x);

        System.out.println(link1 instanceof B);
        System.out.println(link2 instanceof B);
        System.out.println(link1 instanceof A);
        System.out.println(link2 instanceof A);
        System.out.println(link2 instanceof Object);
    }
}
