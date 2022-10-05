package hu.petrik.sokszogoop;

public class Haromszog extends Sokszog{
    private double b;
    private double c;

    public Haromszog(){
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
        return Math.random() *10 + 5;
    }

    public Haromszog(double a, double b, double c){
        super(a);
        this.b = b;
        this.c = c;
        if (!this.isSzerkezthető()){
            throw new IllegalArgumentException("A háromszög nem megfelelő");
        }
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
        if (!this.isSzerkezthető()){
            throw new IllegalArgumentException("A háromszög nem megfelelő");
        }
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
        if (!this.isSzerkezthető()){
            throw new IllegalArgumentException("A háromszög nem megfelelő");
        }
    }
    @Override
    public void setA(Double a) {
        super.setA(a);
        if (!this.isSzerkezthető()){
            throw new IllegalArgumentException("A háromszög nem megfelelő");
        }
    }

    private boolean isSzerkezthető(){
        boolean szerkeztheto = true;
        if(this.getA()+this.b <= this.c || this.getA()+this.c <= this.b || this.b + this.c <= this.getA()){
            szerkeztheto = false;
        }
        return szerkeztheto;
    }
    @Override
    public double getK() {
        return this.getA()+this.b+this.c;
    }

    private double getS() {
        return this.getK() /2;
    }
    @Override
    public double getT() {
        return Math.sqrt(this.getS() * (this.getS() - this.getA()) * (this.getS() - this.b) * (this.getS() - this.c));
    }
    @Override
    public String toString() {
        return String.format("Háromszög: a = %.3f - b = %.3f - c = %.3f - %s", this.getA(), this.b,this.c,super.toString());
    }
}