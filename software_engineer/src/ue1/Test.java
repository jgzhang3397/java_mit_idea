package ue1;

public class Test {
    public static void main(String[] args) {
        Viereck r = new Rechteck(3, 5);
        Viereck q = new Quadrat(3);
        Trapez  t = new Trapez(2, 3, 8);

        System.out.println(r.berechneFlaeche());
        System.out.println(q.berechneFlaeche());
        System.out.println(t.berechneFlaeche());
    }
}
