import java.util.Scanner;

public class Main {
    static final int fieldSize = 9;

    static void printField(int[] field) {
        System.out.print("|");
        for(int i = 0; i < fieldSize; i++) {
            if(field[i] == 0) {
                System.out.print("   |");
            } else if(field[i] == 1) {
                System.out.print(" X |");
            } else if(field[i] == 2) {
                System.out.print(" O |");
            }
            if(i % 3 == 2) {
                System.out.println();
                if(i != 8) {
                    System.out.print("|");
                }
            }
        }
    }

    static void makeHod(int player, int[] field) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер клетки для " + (player == 1 ? "X" : "0"));
            int pos = scanner.nextInt();
            if (pos > fieldSize || pos < 1 || field[pos - 1] != 0) {
                System.out.println("Неверное значение, введите снова.");
                continue;
            }
            field[pos - 1] = player;
            return;
        }
    }

    static boolean checkForGameOver(int[] field) {
        if(field[0] != 0 && field[0] == field[1] && field[1] == field[2]) {
            System.out.println("Победил " + (field[0] == 1 ? "X" : "0"));
            return true;
        }
        if(field[3] != 0 && field[3] == field[4] && field[4] == field[5]) {
            System.out.println("Победил " + (field[3] == 1 ? "X" : "0"));
            return true;
        }
        if(field[6] != 0 && field[6] == field[7] && field[7] == field[8]) {
            System.out.println("Победил " + (field[6] == 1 ? "X" : "0"));
            return true;
        }
        if(field[0] != 0 && field[0] == field[3] && field[3] == field[6]) {
            System.out.println("Победил " + (field[0] == 1 ? "X" : "0"));
            return true;
        }
        if(field[1] != 0 && field[1] == field[4] && field[4] == field[7]) {
            System.out.println("Победил " + (field[1] == 1 ? "X" : "0"));
            return true;
        }
        if(field[2] != 0 && field[2] == field[5] && field[5] == field[8]) {
            System.out.println("Победил " + (field[2] == 1 ? "X" : "0"));
            return true;
        }
        if(field[0] != 0 && field[0] == field[4] && field[4] == field[8]) {
            System.out.println("Победил " + (field[0] == 1 ? "X" : "0"));
            return true;
        }
        if(field[2] != 0 && field[2] == field[4] && field[4] == field[6]) {
            System.out.println("Победил " + (field[2] == 1 ? "X" : "0"));
            return true;
        }
        // Проверка на ничью
        for (int i = 0; i < fieldSize; i++) {
            if(field[i] == 0) {
                return false;
            }
        }
        System.out.println("Ничья");
        return true;
    }

    public static void main(String[] args) {
        int[] field = new int[fieldSize];
        int player = 1;
        while (!checkForGameOver(field)) {
            makeHod(player, field);
            printField(field);
            player = player == 1 ? 2 : 1;
        }
    }
}