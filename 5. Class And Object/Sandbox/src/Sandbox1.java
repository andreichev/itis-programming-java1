import java.util.ArrayList;

public class Sandbox1 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[] {
          new Dog("Чарли"),
          new Cat("Денди"),
          new Cat("Леди"),
          new Dog("Рич"),
          new Cat("Майя"),
          new Cat("Томи"),
          new Cat("Сережа умер"),
          new Cat("Рыжик"),
          new Cat("Маруся"),
        };

        int dogsCount = 0;
        int catsCount = 0;
        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                dogsCount++;
            } else if (animal instanceof Cat) {
                catsCount++;
            }
        }
        System.out.println(catsCount);
    }
}
