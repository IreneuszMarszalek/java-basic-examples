package pl.sdacademy;

import pl.sdacademy.examples.Party;

public class PartyApp {
    public static void main(String[] args) {
        String tekst = "aAbaBb";

        Party a = new Party();

        System.out.print(a.sortPartyMember(tekst));
    }
}
