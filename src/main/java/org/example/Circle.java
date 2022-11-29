package org.example;

public class Circle {
    private double r;
    private double s;
    private double p;
    public Circle(double r) {
        if(r>0) {
            this.r = r;
            this.s=Math.PI*r*r;
            this.p=2*Math.PI*r;
        }
        else {
            System.out.println("incorect value");
        }
    }

    public double getS() {
        return s;
    }

    public double getP() {
        return p;
    }
}
