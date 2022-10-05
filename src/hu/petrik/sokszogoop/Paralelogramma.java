package hu.petrik.sokszogoop;

public class Paralelogramma extends Sokszog {
    private double b;
    private double alfa;
    public Paralelogramma(){
        super(getVeletlenSzog());
        this.b = getVeletlenSzog();
        this.alfa = getVeletlenSzog();
        while (!this.isSzerkezthető()){
            super.setA(getVeletlenSzog());
            this.b = getVeletlenSzog();
            this.alfa = getVeletlenSzog();
        }
    }
    private static double getVeletlenSzog() {
        return Math.random() * 178 + 1;
    }
    public Paralelogramma(double a, double b, double alfa) {
        super(a);
        this.b = b;
        this.alfa = alfa;
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
    public double getAlfa() {
        return alfa;
    }
    public void setAlfa(double alfa) {
        this.alfa = alfa;
        if (!this.isSzerkezthető()){
            throw new IllegalArgumentException("A paralelogramma nem megfelelő");
        }
    }
    private boolean isSzerkezthető(){
        boolean szerkeztheto = true;
        if(alfa > 180 || alfa < 0){
            szerkeztheto = false;
        }
        return szerkeztheto;
    }
    @Override
    public double getK() {
        return 2*(this.getA()+this.b);
    }
    @Override
    public double getT() {
        return this.getA()*this.b*Math.sin(Math.toRadians(alfa));
    }
    @Override
    public String toString() {
        return String.format("Paralelogramma: a = %.3f - b = %.3f - alfa = %.3f fok - %s", this.getA(), this.b,this.alfa,super.toString());
    }
}