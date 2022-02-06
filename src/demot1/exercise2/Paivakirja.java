package demot1.exercise2;

import java.util.ArrayList;

public class Paivakirja {

    private String salasana;
    private ArrayList<String> merkinnat;

    public Paivakirja(String salasana) {
        this.salasana = salasana;
        this.merkinnat = new ArrayList<String>();
    }

    private void lisaaMerkinta(String salasana, String merkinta) {
        if (this.salasana != salasana) {
            System.out.println("Virheellinen salasana!");
        } else {
            this.merkinnat.add(merkinta);
        }
    }

    private void setSalasana(String salasana, String uusiSalasana) {
        if (this.salasana != salasana) {
            System.out.println("Virheellinen salasana!");
        } else {
            this.salasana = uusiSalasana;
        }
    }

    private void lueMerkinta(String salasana, int merkinta){
        if (this.salasana != salasana) {
            System.out.println("Virheellinen salasana!");
        } else {
            System.out.println(merkinnat.get(merkinta));
        }
    }
}
