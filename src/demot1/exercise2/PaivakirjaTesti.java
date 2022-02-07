package demot1.exercise2;

public class PaivakirjaTesti {

    public static void main(String[] args) {

        Paivakirja pk = new Paivakirja("testi");

        pk.lisaaMerkinta("Tanaan on ensimmaiset OOPin demot");
        pk.lisaaMerkinta("Toivottavasti tehtavat eivat ole olleet liian vaikeita");
        System.out.println(pk.lueMerkinta(0));
        System.out.println(pk.lueMerkinta(1));
    }
}
