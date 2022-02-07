package demot1.exercise2;

import java.util.ArrayList;
import java.util.Scanner;

public class Paivakirja {

    private String salasana;
    private ArrayList<String> merkinnat;
    private Scanner lukija;

    public Paivakirja(String salasana) {
        this.salasana = salasana;
        this.merkinnat = new ArrayList<String>();
        lukija = new Scanner(System.in);
    }

    private boolean tarkistaSalasana() {
        System.out.println("Syota salasana: ");
        if  (lukija.nextLine().equals(salasana)) {
            return true;
        } else {
            System.out.println("Virheellinen salasana!");
            return false;
        }
    }

    public void lisaaMerkinta(String merkinta) {
        if (!tarkistaSalasana()) {
           return;
        } else {
            this.merkinnat.add(merkinta);
        }
    }

    public void setSalasana(String uusiSalasana) {
        if (!tarkistaSalasana()) {
            return;
        } else {
            this.salasana = uusiSalasana;
        }
    }

    public String lueMerkinta(int merkinta){
        if (!tarkistaSalasana()) {
            return "";
        } else {
            return merkinnat.get(merkinta);
        }
    }
}
