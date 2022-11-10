package ru.itis.oopexample.example2;

// Object
// A (Object)
// B (A (Object))
// C (B (A (Object)))
public class Example2 {
    public static void main(String[] args) {
        A link1 = new A();
        B link2 = new B();
        B link3 = new C();

        Object[] array = new Object[10];
        array[0] = link1;
        array[1] = link2;
        array[3] = link3;

        System.out.println(link1 instanceof B);
        System.out.println(link2 instanceof B);
        System.out.println(link1 instanceof A);
        System.out.println(link2 instanceof A);
        System.out.println(link2 instanceof Object);
    }
}
