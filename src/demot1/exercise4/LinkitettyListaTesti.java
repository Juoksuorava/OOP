package demot1.exercise4;

public class LinkitettyListaTesti {

    public static void main(String[] args) {
        LinkitettyLista testiLista = new LinkitettyLista();
        
        /** lisätään kasa arvoja **/
        for (int i=1; i<100; i += 10) {
            testiLista.lisaaAlkio(i);
        }
        testiLista.tulosta();
        
        /** Lisätään vielä kaksi arvoa **/
        testiLista.lisaaAlkio(100);
        testiLista.lisaaAlkio(20000);
        
        testiLista.tulosta();
        
        /** Poistetaan arvo 31 **/
        testiLista.poistaAlkio(31);
        testiLista.tulosta();
        
        /** Poistetaan arvo 1 **/
        testiLista.poistaAlkio(1);
        testiLista.tulosta();
        
        /** Onko alkiota 51? **/
        System.out.println(testiLista.haeAlkio(51));
        
        /** Onko alkiota 99? **/
        System.out.println(testiLista.haeAlkio(99));
    }
}
