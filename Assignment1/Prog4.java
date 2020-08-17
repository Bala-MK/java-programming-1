package com.company;
import java.lang.Math;
class Circle{
    private double radius;
    private String color;
    Circle(){
        radius=1.0;
        color="red";
    }
    Circle(double radius){
        this();
        this.radius=radius;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
}
public class Prog4 {
    public static void main(String[] args) {
        Circle c=new Circle(20);
        System.out.println(c.getRadius());
        System.out.println(c.getArea());
        System.out.println(c.getColor());
    }
}
