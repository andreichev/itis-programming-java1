package filmactors;

public class FilmActors {
    public static void main(String[] args) {
        String[][] actorNamesGroupedByChapters = {
                { "Vin Diesel", "Paul Walker","Michelle Rodriguez","Jordana Brewster" },
                { "Paul Walker", "Tyrese Gibson", "Cole Hauser", "Eva Mendes" }
        };
        String[] chapterNames = { "Chapter 1.", "Chapter 2." };

        for (int i = 0; i < chapterNames.length; i++) {
            System.out.println(chapterNames[i] + " Actors:");
            for (int j = 0; j < actorNamesGroupedByChapters[i].length; j++) {
                System.out.print(actorNamesGroupedByChapters[i][j] + ";");
            }
            System.out.println();
        }
    }
}
