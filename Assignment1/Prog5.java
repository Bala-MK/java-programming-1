package com.company;

import java.util.Scanner;

class Complex{
    int real,imaginary;
    Complex(){
        Scanner s=new Scanner(System.in);
        System.out.println("Real=");
        real=s.nextInt();
        System.out.println("Imaginary=");
        imaginary=s.nextInt();
    }
    void sum(Complex a){
        int x=real+a.real;
        int y=imaginary+a.imaginary;
        System.out.println("Sum="+x+"+i"+"("+y+")");

    }
    void diference(Complex a){
        int x=real-a.real;
        int y=imaginary-a.imaginary;
        System.out.println("Diference="+x+"+i"+"("+y+")");
    }
    void product(Complex a){
        int x=a.real*real-a.imaginary*imaginary;
        int y=a.real*imaginary+a.imaginary*real;
        System.out.println("Product="+x+"+i"+"("+y+")");
    }
}
public class Prog5 {
    public static void main(String[] args) {
        Complex c1=new Complex();
        Complex c2=new Complex();
        c1.sum(c2);
        c1.diference(c2);
        c1.product(c2);
    }
}
