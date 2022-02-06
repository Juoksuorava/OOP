package demot1.exercise4;

public class LinkitettyLista {

    /** Listan ensimmaisen alkion avulla paasee kasiksi muihin alkioihin **/
    private Alkio ensimmainen;

    /** Konstruktori */
    public LinkitettyLista() {
        ensimmainen = null;
    }

    /**
    * Lisaa annetun arvon listan peraan
    * @param arvo arvo, jonka lisattava alkio saa
     **/
    public void lisaaAlkio(int arvo){
        /**
         * Jos lista on tyhja, lisataan uusi alkio ensimmaiseksi alkioksi
         * Muulloin etsitaan viimeinen alkio eli alkio, jonka seuraava alkio on null
         **/
        if (ensimmainen == null) {
            this.ensimmainen = new Alkio(arvo, null);
        } else {
            Alkio a = ensimmainen;
            while (a.getSeuraava() != null) {
                a = a.getSeuraava();
            }
            /** Lisataan uusi alkio viimeisein peraan **/
            a.setSeuraava(new Alkio(arvo, null));
        }
    }
    /**
     * Palauttaa tiedon siita, loytyyko annettu arvo listasta.
     * @param arvo arvo, jota etsitaan
     * @return <code>true</code>, jos arvo loytyy listasta,
     * muulloin <code>false</code>.
     **/
    public boolean haeAlkio(int arvo) {
        /**  Jos lista on tyhjä, alkiota ei löydy **/
        if (ensimmainen == null) {
            return false;
        }
        /** Käydään lista läpi **/
        Alkio a = ensimmainen;

        while (a != null) {
            if (a.getArvo() == arvo) {
                return true;
            }
            a = a.getSeuraava();
        }
        /** Jos alkiota ei löytynyt listalta, palautetaan false **/
        return false;
    }

    /**
     * Poistaa listalta ekan alkion, jolla on annettu arvo
     * @param arvo arvo, jonka mukainen alkio poistetaan
     */
    public void poistaAlkio(int arvo) {
        Alkio nykyinen = ensimmainen;
        Alkio edellinen = null;

        while (nykyinen != null) {
            if (nykyinen.getArvo() == arvo) {
                /** Ensimmaisen alkion voi poistaa vaihtamalla toisen alkion ensimmaiseksi **/
                if (edellinen == null) {
                    ensimmainen = ensimmainen.getSeuraava();
                } else {
                    /** Muut alkiot poistetaan sijoittamalla nykyista
                     * edeltavan alkion seuraavaksi alkioksi nykyista seuraava alkio
                     * eli a -> b -> c
                     * muuttuu muotoon
                     * a -> c
                     **/
                    edellinen.setSeuraava(nykyinen.getSeuraava());
                }
            }
            edellinen = nykyinen;
            nykyinen = nykyinen.getSeuraava();
        }
    }

    /** Apumetodi, joka tulostaa listan ruudulle **/
    public void tulosta() {
        Alkio a = ensimmainen;
        while (a != null) {
            System.out.print(a);
            if (a.getSeuraava() != null) {
                System.out.print(" -> ");
            }
            a = a.getSeuraava();
        }
        System.out.println();
    }
}
