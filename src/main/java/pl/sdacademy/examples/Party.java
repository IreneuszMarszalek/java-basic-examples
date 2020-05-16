package pl.sdacademy.examples;

import java.util.Arrays;
import java.util.Scanner;

public class Party {
    public String sortPartyMember (String tekst){
        char[] charTbl = tekst.toCharArray();

        Arrays.sort(charTbl);
        //char[] sortedTbl = Arrays.toString(charTbl).toCharArray();
        char[] sortedTbl = charTbl;
        String result = "";

        for (int i = 0; i < sortedTbl.length; i++) {
            if (Character.isUpperCase(sortedTbl[i])){
                result += Character.toString(sortedTbl[i]);


                for (int j = i+1; j < sortedTbl.length; j++) {
                    if (sortedTbl[j] > Character.toLowerCase(sortedTbl[i])){
                        break;
                    }

                    if (Character.toLowerCase(sortedTbl[i]) == sortedTbl[j]){
                        result += Character.toString(sortedTbl[j]);
                    }
                }
            }else{
                break;
            }
        }
        return result;
    }
    // metoda by trenerka Anna Książek
    public static void sortPartyMembers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj uczestników przyjęcia:");
        String allMembers = scanner.nextLine();
        char[] members = allMembers.toCharArray();
        Arrays.sort(members);
        System.out.println(members);
        for (char mother : members) {
            if (Character.isUpperCase(mother)) {
                System.out.print(mother);
            }
        }
    }
}
