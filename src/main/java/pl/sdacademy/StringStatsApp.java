package pl.sdacademy;

import pl.sdacademy.examples.StringStats;

import java.util.Scanner;

public class StringStatsApp {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj tekst:");
        String text = scanner.nextLine();*/
        String text = "zxybbccaaa";

        StringStats a = new StringStats();
        System.out.println(a.howManyUniqSigns(text));
    }
}
