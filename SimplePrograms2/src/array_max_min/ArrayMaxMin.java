package array_max_min;

public class ArrayMaxMin {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 100;

        double[] array = new double[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = Math.random();
        }

        double max = array[0];
        double min = array[0];
        double avg = 0;
        for (int i = 0; i < ARRAY_SIZE; i++) {
            if(max < array[i]) {
                max = array[i];
            }
            if(min > array[i]) {
                min = array[i];
            }
            avg += array[i];
        }
        avg /= ARRAY_SIZE;
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
    }
}
