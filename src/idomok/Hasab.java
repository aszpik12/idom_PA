package idomok;

public class Hasab extends FaIdom {

    private double a, b, magassag;

    public Hasab(double a, double b, double magassag) {
        this.a = a;
        this.b = b;
        this.magassag = magassag;
    }

    @Override
    public double terfogat() {
        return a * b * magassag;
    }

    @Override
    public String toString() {
        return "Hasab{" + "a=" + a + ", b=" + b + ", magassag=" + magassag + "térfogat=" + terfogat() + '}';
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getMagassag() {
        return magassag;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setMagassag(double magassag) {
        this.magassag = magassag;
    }

    
    
}
