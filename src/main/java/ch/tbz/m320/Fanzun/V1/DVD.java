package ch.tbz.m320.Fanzun.V1;

public class DVD extends Medien {
    private int filmLaenge;

    public DVD(String titel, int jahr, double preis, int filmLaenge) {
        super(titel, jahr, preis);
        this.filmLaenge = filmLaenge;
    }
}
