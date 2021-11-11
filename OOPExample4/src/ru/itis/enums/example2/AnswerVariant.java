package ru.itis.enums.example2;

public enum AnswerVariant {
    POSITIVE(new String[] { "It is certain", "Yes" }, AnsiColor.BLUE),
    POSSIBLE(new String[] { "Most likely", "Outlook good" }, AnsiColor.GREEN),
    NEUTRAL(new String[] { "Better not tell you now" }, AnsiColor.YELLOW),
    NEGATIVE(new String[] { "Don’t count on it " }, AnsiColor.RED)
    ;

    public final String[] answers;
    public final AnsiColor color;

    AnswerVariant(String[] answers, AnsiColor color) {
        this.answers = answers;
        this.color = color;
    }

    String getRandomMessage() {
        int randomElementIndex = (int) (Math.random() * answers.length);
        return answers[randomElementIndex];
    }

    static AnswerVariant[] getAll() {
        return new AnswerVariant[] { POSITIVE, POSSIBLE, NEUTRAL, NEGATIVE };
    }
}
