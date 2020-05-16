package pl.sdacademy.examples;

import java.util.Arrays;

public class StringStats {
    public void theMostFrequentSign (String tekst){
        int tblSize = howManyUniqSigns(tekst);
        String[][] tempTbl  = new String[tblSize][2];

        int counter = 0;


    }

    public int howManyUniqSigns (String tekst){
        char[] charTbl = tekst.toCharArray();
        Arrays.sort(charTbl);
        System.out.println(Arrays.toString(charTbl));

        int counter = 1;

        for (int i = 1; i < charTbl.length-1 ; i++) {
            if (charTbl[i] != charTbl [i+1]){
                    counter ++;
            }
        }
        return counter;
    }
}
