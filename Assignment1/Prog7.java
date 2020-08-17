package com.company;
import java.lang.Math;
class Triangle{
    double area(double a,double b,double c){
        double p=(a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
public class Prog7 {
    public static void main(String[] args) {
        Triangle tri=new Triangle();
        double area=tri.area(24,25,10);
        System.out.println(area);
    }
}
