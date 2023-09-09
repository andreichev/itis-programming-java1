package bubblesort;

//      x = 4, y = 5
// Как поменяли местами значения в x и y:
// 1. x += y;
//      x = 9, y = 5
// 2. y = x - y;
//      x = 9, y = 4
// 3. x -= y;
//      x = 5, y = 4

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {10, 3, 4, 12, 13, 1, 7};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    array[j] += array[j + 1];
                    array[j + 1] = array[j] - array[j + 1];
                    array[j] -= array[j + 1];
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
