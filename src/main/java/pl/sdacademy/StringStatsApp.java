package pl.sdacademy;

import pl.sdacademy.examples.StringStats;

public class StringStatsApp {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj tekst:");
        String text = scanner.nextLine();*/
        String text = "Aa";

        StringStats a = new StringStats();
        /*String[][] tbl2D = a.signFrequencyin2D(text);
        for (String[] b: tbl2D) {
            System.out.println(Arrays.toString(b));
        }*/

        //System.out.println(a.indexOfMostFrequentSign(tbl2D));

        //String[] tbl = {"b","b"};
        //System.out.println(a.ifCharExistInStringTable("a", tbl ));

        /*if (a.indexOfMostFrequentSign(tbl2D) == -1){
            System.out.println("Brak najczęściej występującej litery");
        }else {
            System.out.println(tbl2D[0][a.indexOfMostFrequentSign(tbl2D)] + ":" + tbl2D[1][a.indexOfMostFrequentSign(tbl2D)]);
        }
// cześć trenerki.
        char foundLetter = findLetter();
        if (foundLetter == NOT_FOUND) {
            System.out.println("Brak najczęściej występującej litery");
        } else {
            System.out.println("Znaleziono - " + foundLetter);
        }*/

        System.out.println(a.string2ASCII(text));
    }
}
