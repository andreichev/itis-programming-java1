package ru.itis.university.I.bad;

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
            furniture.open();
            System.out.println(furniture.getColor());
        }
    }
}
