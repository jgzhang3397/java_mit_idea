package ue1;

public class Rechteck extends Viereck{
    private double laenge;
    private double breite;


    public Rechteck (double laenge, double breite)
    {
        meldeErzeugung();
        this.laenge = laenge;
        this.breite = breite;
    }

    @Override
    public double berechneFlaeche() {
        meldeBerchnung();
        return breite*laenge;
    }

    @Override
    protected void meldeErzeugung() {
        System.out.println("Rechteck wird erzeugt.");
    }

    @Override
    protected void meldeBerchnung() {
        System.out.println("Flaeche des Rechtecks wird berechnet.");
    }

    public double getBreite() {
        System.out.println("Breite wird abgefagt.");
        return breite;
    }

    public double getLaenge() {
        System.out.println("Laenge wird abgefragt.");
        return laenge;
    }

}
