package demot1.exercise1;

public class Laiva {

    private String nimi;
    private double pituus;
    private double syvays;
    private double nopeus;

    public Laiva(String nimi, double nopeus, double pituus, double syvays) {
        this.nimi = nimi;
        this.nopeus = nopeus;
        this.pituus = nopeus;
        this.syvays = syvays;
    }

    public double laskeAika(double matka, boolean meripeninkulma) {

        if (meripeninkulma == true) {
            double aika = matka / nopeus;
            return aika;
        } else {
            double aika = matka / (nopeus * 1.852);
            return aika;
        }
    }
}