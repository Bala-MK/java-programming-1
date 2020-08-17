package com.company;

import java.util.Scanner;

class Rectangle{
    int width,height;
    void display(){
        System.out.println("width="+width+" "+"height="+height);
    }
}
class RectangleArea extends Rectangle {
    void read_input(){
        Scanner s=new Scanner(System.in);
        width=s.nextInt();
        height=s.nextInt();
    }
    void display(){
        super.display();
        System.out.println("Area="+width*height);
    }
}
public class Prog2 {
    public static void main(String[] args) {
        RectangleArea area=new RectangleArea();
        area.read_input();
        area.display();
    }
}
