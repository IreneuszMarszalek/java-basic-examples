package pl.sdacademy;

import pl.sdacademy.examples.Party;

public class PartyApp {
    public static void main(String[] args) {
        String tekst = "aabbAB";
        Party a = new Party();

        String sortedTekst = a.sortString(tekst);

       // System.out.println(a.sortPartyMember(tekst));
        System.out.println(a.sortPartyMemberWithOutTwoLoops(sortedTekst));
    }
}
