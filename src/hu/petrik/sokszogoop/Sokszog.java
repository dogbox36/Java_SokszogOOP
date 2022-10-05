package hu.petrik.sokszogoop;

public abstract class Sokszog {
    private double a;
    public Sokszog(double a) {
        this.a = a;
    }
    public double getA() {return a;}
    public void setA(Double a) {this.a = a;}
    public abstract double getK();
    public abstract double getT();
    @Override
    public String toString() {
        return String.format("K = %.3f - T = %.3f", this.getK(), this.getT());
    }
}