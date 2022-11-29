package org.example;

public class Main {
    public static void main(String[] args) {
       Rectangle square=new Rectangle(10.3,10.3);
       System.out.println(square.getS());
       System.out.println(square.getP());
       Circle circle=new Circle(3);
       System.out.println(circle.getS());
       System.out.println(circle.getP());
       Triangle triangle = new Triangle(3,2,0.5);
       System.out.println(triangle.getS());
       System.out.println(triangle.getP());
    }
}