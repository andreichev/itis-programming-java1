package ru.itis.programs.diskretka;

public class Diskretka {
    static void print(boolean x) {
        System.out.print(x ? 1 : 0);
    }

    // static boolean func(boolean x, boolean y, boolean z) {
    //     return x != y || z;
    // }

    static boolean func(boolean x, boolean y, boolean z) {
        return x && y || z;
    }

    public static void main(String[] args) {
        int argumentsCount = 3;
        int variantsCount = (int) Math.pow(2, argumentsCount);
        boolean[] table = new boolean[variantsCount];
        boolean[][] variants = new boolean[variantsCount][argumentsCount];

        for (int i = 0; i < variantsCount; i++) {
            int t = i;
            for (int j = argumentsCount - 1; j >= 0; j--) {
                variants[i][j] = t % 2 != 0;
                t /= 2;
            }
            table[i] = func(variants[i][0], variants[i][1], variants[i][2]);
        }

        for (int i = 0; i < variantsCount; i++) {
            for (int j = 0; j < argumentsCount; j++) {
                print(variants[i][j]);
                System.out.print(" ");
            }
            System.out.print(" | ");
            print(table[i]);
            System.out.println();
        }
    }
}
