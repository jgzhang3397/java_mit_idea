package ue1;

public class Quadrat extends Rechteck{
    public Quadrat(double laenge)
    {
        super(laenge, laenge);
        System.out.println("Quadrats wird erzeugt");
    }
    @Override
    public double berechneFlaeche() {
        System.out.println("Flaeche des Quadrats wird brechnet.");
        return super.berechneFlaeche();
    }
}
