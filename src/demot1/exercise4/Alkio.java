package demot1.exercise4;

public class Alkio {

    /** Alkion arvo seka tieto seuraavasta alkiosta **/
    private int arvo;
    private Alkio seuraava;

    /** Konstruktori **/
    public Alkio(int arvo, Alkio seuraava) {
        this.arvo = arvo;
        this.seuraava = seuraava;
    }

    /** Asetus ja havannointi -metodit **/
    public int getArvo() {
        return arvo;
    }
    public void setArvo(int arvo) {
        this.arvo = arvo;
    }
    public Alkio getSeuraava() {
        return seuraava;
    }
    public void setSeuraava(Alkio seuraava) {
        this.seuraava = seuraava;
    }

    /** Palauttaa alkion arvon merkkijonona **/
    @Override
    public String toString() {
        return "" + getArvo();
    }
}
