package ru.itis.university.I.good;

// I - Interface Segregation
// Создавайте узкоспециализированные интерфейсы, предназначенные для конкретного клиента.
// Клиенты не должны зависеть от интерфейсов, которые они не используют.
public class ExampleI {
    public static void main(String[] args) {
        Furniture[] furnitures = {
                new Table("blue", 90, 200),
                new Shkaf("white")
        };

        for (Furniture furniture: furnitures) {
            if(furniture instanceof ClosableFurniture) {
                ClosableFurniture f = (ClosableFurniture) furniture;
                f.open();
            }
            System.out.println(furniture.getColor());
        }
    }
}
