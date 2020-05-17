package pl.sdacademy.examples;

public class CeasarCode {
    public static final int KEY = 2;

    public String encode (String tekst){

            String newText = "";

            for(int i = 0; i<tekst.length(); i++){
                if(tekst.charAt(i) == ' '){
                    newText+=Character.toString(tekst.charAt(i));
                    continue;
                }
                if ((int) tekst.charAt(i) >=65 && (int) tekst.charAt(i) <=90 ) {
                    if(((int) tekst.charAt(i) + KEY - 65) % 26 == 0) {
                        newText += Character.toString((char) 26 + 65);
                    }else {
                        newText += Character.toString((char) ((int) tekst.charAt(i) + KEY - 65) % 26 + 65);
                    }
                }

                if ((int) tekst.charAt(i) >=97 && (int) tekst.charAt(i) <=122 ) {
                    if(((int) tekst.charAt(i) + KEY - 97) % 26 == 0) {
                        newText += Character.toString((char) 26 + 97);
                    }else {
                        newText += Character.toString((char) ((int) tekst.charAt(i) + KEY - 97) % 26 + 97);
                    }
                }
            }
            return newText;
    }

    public String dencode (String tekst){

        String newText = "";

        for(int i = 0; i<tekst.length(); i++){
            if(tekst.charAt(i) == ' '){
                newText+=Character.toString(tekst.charAt(i));
                continue;
            }
            if ((int) tekst.charAt(i) >=65 && (int) tekst.charAt(i) <=90 ) {
                if(((int) tekst.charAt(i) - KEY - 65) % 26 == 0) {
                    newText += Character.toString((char) 26 + 65);
                }else {
                    newText += Character.toString((char) ((int) tekst.charAt(i) - KEY - 65) % 26 + 65);
                }
            }

            if ((int) tekst.charAt(i) >=97 && (int) tekst.charAt(i) <=122 ) {
                if(((int) tekst.charAt(i) - KEY - 97) % 26 == 0) {
                    newText += Character.toString((char) 26 + 97);
                }else {
                    newText += Character.toString((char) ((int) tekst.charAt(i) - KEY - 97) % 26 + 97);
                }
            }
        }
        return newText;
    }
}
