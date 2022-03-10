package ue1;

import java.util.Objects;

public class Trapez extends Viereck{

    private double parallele1, parallele2;
    private double hoehe;

    public Trapez(double parallele1, double parallele2, double hoehe)
    {
        meldeErzeugung();
        this.parallele1 = parallele1;
        this.parallele2 = parallele2;
        this.hoehe = hoehe;

    }

    @Override
    protected double berechneFlaeche() {
        meldeBerchnung();
        return 0.5*(parallele1+parallele2)*hoehe;
    }

    @Override
    protected void meldeErzeugung() {
        System.out.println("Trapez wird erzeugt.");
    }

    @Override
    protected void meldeBerchnung() {
        System.out.println("Flaeche des Trapezes wird berechnet.");
    }
}
