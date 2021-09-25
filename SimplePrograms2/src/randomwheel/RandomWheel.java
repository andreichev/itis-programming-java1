package randomwheel;

public class RandomWheel {
    public static void main(String[] args) {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BLUE = "\u001B[34m";

        String[] positive = { "It is certain", "Yes" };
        String[] possible = { "Most likely", "Outlook good" };
        String[] neutral = { "Better not tell you now" };
        String[] negative = { "Don’t count on it " };

        String[] variantColor = { ANSI_BLUE, ANSI_GREEN, ANSI_YELLOW, ANSI_RED  };
        String[][] variants = { positive, possible, neutral, negative };

        int randomVariantIndex = (int) (Math.random() * variants.length);
        String[] selectedRange = variants[randomVariantIndex];

        int randomElementIndex = (int) (Math.random() * selectedRange.length);
        String selectedStatement = selectedRange[randomElementIndex];

        String color = variantColor[randomVariantIndex];
        System.out.println(color + selectedStatement);
    }
}
