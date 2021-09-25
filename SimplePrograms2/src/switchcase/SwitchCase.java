package switchcase;

public class SwitchCase {
    public static void main(String[] args) {
        // Программирование или Алгебра или Дискретка
        String exam = "Программирование";

        if(exam.equals("Программирование")) {
            System.out.println(exam + ": Абрамский М.М.");
        } else if(exam.equals("Алгебра")) {
            System.out.println(exam + ": Арсланов М.М.");
        } else if(exam.equals("Дискретка")) {
            System.out.println(exam + ": Зубков М.В.");
        }

        System.out.println("То же самое: ");

        switch (exam) {
            case "Программирование":
                System.out.println(exam + ": Абрамский М.М.");
                break;
            case "Алгебра":
                System.out.println(exam + ": Арсланов М.М.");
                break;
            case "Дискретка":
                System.out.println(exam + ": Зубков М.В.");
                break;
        }
    }
}
