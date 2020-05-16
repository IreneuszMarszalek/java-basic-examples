package pl.sdacademy.examples;

import java.util.Arrays;
import java.util.Scanner;

public class Party {
    public String sortPartyMemberWithOutTwoLoops (String tekst){
        char[] charTbl = tekst.toCharArray();

        //Arrays.sort(charTbl);
        String result = "";
        char temp = 0;

        if (Character.isUpperCase(charTbl[0])) {
            if (charTbl[0] != Character.toUpperCase(charTbl[1])) {
                temp = charTbl[1];
                charTbl[1] = charTbl[2];
                charTbl[2] = temp;
                result = sortPartyMemberWithOutTwoLoops(String.valueOf(charTbl) );
            }else{
                result = String.valueOf(charTbl[0]) + sortPartyMemberWithOutTwoLoops(String.valueOf(Arrays.copyOfRange(charTbl, 1, charTbl.length )));
            }
        }
        if ((Character.isLowerCase(charTbl[0]))){
            if (charTbl.length == 1){
                result = String.valueOf(charTbl);
            }
            if (charTbl.length > 2) {
                if ((charTbl[0] != charTbl[1]) && (charTbl[0] == charTbl[2])) {
                    temp = charTbl[1];
                    charTbl[1] = charTbl[2];
                    charTbl[2] = temp;
                    result = sortPartyMemberWithOutTwoLoops(String.valueOf(charTbl));
                } else {
                    result = String.valueOf(charTbl[0]) +  sortPartyMemberWithOutTwoLoops(String.valueOf(Arrays.copyOfRange(charTbl, 1, charTbl.length)));
                }
            }
            if(charTbl.length == 2){
                if ((charTbl[0] != charTbl[1])) {
                    temp = charTbl[1];
                    charTbl[1] = charTbl[2];
                    charTbl[2] = temp;
                    result = sortPartyMemberWithOutTwoLoops(String.valueOf(charTbl));
                } else {
                    result = String.valueOf(charTbl[0]) +  sortPartyMemberWithOutTwoLoops(String.valueOf(Arrays.copyOfRange(charTbl, 1, charTbl.length)));
                }
            }
        }
        return result;

    }

    public String sortString (String tekst){
        char[] charTbl = tekst.toCharArray();
        Arrays.sort(charTbl);
        return String.valueOf(charTbl);
    }


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
