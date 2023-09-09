package basics;

public class Basics {
    // Data types:
    // boolean - true/false 				1 байт
    // -----------------------------
    // byte - целое число 					1 байт
    // short - целое число 					2 байта
    // int - целое число 					4 байта
    // long - целое число 					8 байт
    // -----------------------------
    // char - символ						1 байт
    // -----------------------------
    // float - число с плавающей запятой	4 байт
    // double - число с плавающей запятой	8 байт
    // -----------------------------
    // String - строка						? байт

    // Операторы
    // > < >= <= != == && ||
    // + - / * ++ --
    // =

    // Управляющие конструкции
    // if (boolean) {
    //  	...
    // } else if(boolean) {
    // 		...
    // } else {
    // 	    ...
    // }
    //
    // while(boolean) { ... }
    // for(...;boolean;...) { ... }

    // CamelCase
    // camelCase
    //
    // Snake_case
    // snake_case

    public static void main(String[] args) {
        System.out.println("BEGIN");
        for (int x = 10; x < 20; x++) {
            System.out.println(x);
        }
        System.out.println("END");
    }
}
