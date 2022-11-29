package org.example;

public class Rectangle {
    private double a;
    private double b;
    private  double s;
    private  double p;
    public Rectangle(double a, double b) {
        if (a > 0 && b > 0) {
            this.a = a;
            this.b = b;
            this.s=a*b;
            this.p=2*(a+b);
        }
        else{
            System.out.println("incorect values");
        }
    }
    public double getS(){
        return s;
    }
    public double getP(){
        return p;
    }
}
