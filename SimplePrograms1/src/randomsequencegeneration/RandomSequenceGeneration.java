package randomsequencegeneration;

public class RandomSequenceGeneration {
    public static void main(String[] args) {
        int minValue = 30;
        int maxValue = 70;
        int delta = maxValue - minValue;

        int[] array = {
                (int) (Math.random() * (delta) + minValue),
                (int) (Math.random() * (delta) + minValue),
                (int) (Math.random() * (delta) + minValue)
        };

        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
