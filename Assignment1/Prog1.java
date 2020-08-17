package com.company;

public class Prog1 {
    interface addition{
        int add(int a,int b);
    }
    interface diff{
        int difference(int a, int b);
    }
    interface multiply{
        int product(int a, int b);
    }
    interface division{
        int  safedivision(int a, int b);
    }
    public static void main(String[] args) {
        addition o1= (a,b)->(a+b);
        diff o2=(a,b)->(a-b);
        multiply o3=(a,b)->(a*b);
        division o4=(a,b)->{
            int r=0;
            try{
                r=a/b;
            }catch (Exception e){
                System.out.println(e);
            }
            return r;
        };
        System.out.println(o1.add(2,4));
        System.out.println(o2.difference(4,2));
        System.out.println(o3.product(2,4));
        System.out.println( o4.safedivision(4,2));
    }
}
