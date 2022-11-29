package org.example;

public class Triangle {
private double a;
private double b;
private double c;
private double s;
private double p;

    public Triangle(double a, double b, double c) {
        if(a>0 && b>0 && c>0 && a+b>c && a+c>b && b+c>a) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.p=a+b+c;
            this.s=Math.sqrt(p/2*(p/2-a)*(p/2-b)*(p/2-c));
        }
        else{
            System.out.println("incorect values");
        }
    }

    public double getS() {
        return s;
    }
    public double getP() {
        return p;
    }
}
