package ru.itis.programs.references;

public class References {
    public static void main(String[] args) {
        // Выделение памяти под ссылку
        int[] x;
        // Выделение памяти для ссылки
        x = new int[1];
        // Переход по ссылке и запись значения
        x[0] = 5;
        // Выделение памяти под ссылку
        int[] y;
        // Копирование значения x в y
        y = x;
        // Переход по ссылке y и прибавление значения
        y[0]++;
        // Вывод значения по ссылке x
        System.out.println(x[0]);
    }
}
