package hu.petrik.sokszogoop;

public class Trapez extends Sokszog{
    private double b;
    private double c;
    public Trapez() {
        super(getVeletlenOld());
        this.b = getVeletlenOld();
        this.c = getVeletlenOld();
        while (!this.isSzerkezthető()){
            super.setA(getVeletlenOld());
            this.b = getVeletlenOld();
            this.c = getVeletlenOld();
        }
    }
    private static double getVeletlenOld() {
        return Math.random() * 10 + 5;
    }
    public Trapez(double a, double b, double c) {
        super(a);
        this.b = b;
        this.c = c;
        if (!this.isSzerkezthető()){
            throw new IllegalArgumentException("A paralelogramma nem megfelelő");
        }
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getC() {
        return c;
    }
    public void setC(double C) {
        this.c = c;
    }
    private boolean isSzerkezthető(){
        boolean szerkeztheto = true;
        if(this.b < this.getA()){
            szerkeztheto = false;
        }
        return szerkeztheto;
    }
    private double getM(){
        return Math.sqrt(Math.pow(c, 2)+Math.pow((this.getA()-this.b/2),2));
    }
    @Override
    public double getK() {
        return this.getA()+this.b+(2*this.c);
    }
    @Override
    public double getT() {
        return getM()*getA()-((this.getA()-this.b)/2);
    }
    @Override
    public String toString() {
        return String.format("Trapéz: a = %.3f - b = %.3f - c = %.3f - %s", this.getA(), this.b,this.c,super.toString());
    }
}
