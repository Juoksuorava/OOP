package demot1.exercise1;

public class Laiva {

    private String nimi;
    private double pituus;
    private double syvays;
    private double nopeus;

    public Laiva(String nimi, double pituus, double syvays, double nopeus) {
        this.nimi = nimi;
        this.nopeus = nopeus;
        this.syvays = syvays;
        this.nopeus = nopeus;
    }

    private double laskeAika(double matka) {

        double aika = matka / nopeus;

        return aika;
    }
}