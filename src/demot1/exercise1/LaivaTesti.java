package demot1.exercise1;

public class LaivaTesti {

    public static void main(String[] args) {

        Laiva paatti = new Laiva("Testi", 500, 120, 60);

        System.out.println(paatti.laskeAika(60, true));
        System.out.println(paatti.laskeAika(60, false));
    }
}
