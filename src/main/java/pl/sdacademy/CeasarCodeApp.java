package pl.sdacademy;

import pl.sdacademy.examples.CeasarCode;

public class CeasarCodeApp {

    public static void main(String[] args) {
        String tekst = "zz";
        String tekst2 = "zz";
        CeasarCode a = new CeasarCode();
        System.out.println(a.encode(tekst));
        System.out.println(a.dencode(tekst2));
    }
}
