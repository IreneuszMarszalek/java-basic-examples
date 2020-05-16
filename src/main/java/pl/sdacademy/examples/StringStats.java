package pl.sdacademy.examples;

import com.sun.source.tree.ClassTree;

import java.lang.instrument.ClassFileTransformer;
import java.util.Arrays;

public class StringStats {
    public String[][] signFrequencyin2D (String tekst){
        int tblSize = howManyUniqSigns(tekst);
        String[][] tempTbl  = new String[2][tblSize];

        int index = 0;
        int lastIndex = 0;
        char[] signTbl = sortCharTable(tekst);

        for (int i = 0; i < signTbl.length; i++) {
            if( ifCharExistInStringTable(Character.toString(signTbl[i]), tempTbl[0]) ){
                index = returnIndexOfCharFromCharTable(Character.toString(signTbl[i]), tempTbl[0]);
                tempTbl[1][index] = Integer.toString (Integer.valueOf(tempTbl[1][index]) + 1) ;
            }else{
                tempTbl[0][lastIndex] = Character.toString(signTbl[i]);
                tempTbl[1][lastIndex] = Integer.toString(1);
                lastIndex++;
            }
        }

        return tempTbl;
    }

    public int howManyUniqSigns (String tekst){
        char[] charTbl = tekst.toCharArray();
        Arrays.sort(charTbl);
        //System.out.println(Arrays.toString(charTbl));

        int counter = 1;

        for (int i = 1; i < charTbl.length-1 ; i++) {
            if (charTbl[i] != charTbl [i+1]){
                    counter ++;
            }
        }
        return counter;
    }

    public char[] sortCharTable (String tekst){
        char[] tbl = tekst.toCharArray();
        Arrays.sort(tbl);
        return tbl;
    }

    public boolean ifCharExistInStringTable (String sign, String[] tbl){
        boolean result = false;
        for (String a: tbl) {
            if (a != null) {
                if (a.equals(sign)) {
                    result = true;
                    break;
                }
            }else {
                break;
            }
        }
        return result;
    }

    public int returnIndexOfCharFromCharTable(String sign, String[] tbl){
        int i = 0;
        for (String a:tbl) {
            if (a.equals(sign)){
                break;
            }else{
                i++;
            }
        }
        return i;
    }

    public int indexOfMostFrequentSign (String[][] tbl){
        int index =0;
        int max = Integer.valueOf(tbl[1][0]);
        for (int i = 0; i < tbl[1].length-1; i++) {
            if (max == Integer.valueOf(tbl[1][i+1])) {
                index = -1;
                continue;
            }
            if (max < Integer.valueOf(tbl[1][i+1])) {
                index = i+1;
                max = Integer.valueOf(tbl[1][i+1]);
            }
        }
        return index;
    }
}
