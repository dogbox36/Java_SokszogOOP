package hu.petrik.sokszogoop;

public class Teglalap extends Sokszog {
    private double b;

    public Teglalap(double a, double b) {
        super(a);
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getKerulet() {
        /*
        Jelenleg super.getA() is ugyan azt eredményezi
         */
        return 2 * (this.getA() + this.b);
    }

    public double getTerulet() {
        return this.getA() * this.b;
    }

    @Override
    public String toString() {
        return String.format("Téglalap: a = %f - b = %f - K = %f - T = %f",
                this.getA(), this.getB(), this.getKerulet(), this. getTerulet());
    }
}
