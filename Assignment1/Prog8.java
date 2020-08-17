package com.company;
class StringException extends Exception{
    StringException(){
        super("There is a String");
    }
}
class OnlyInt{
   public  <E> void print(E...arg){
        try {
            for (E e : arg) {
                if (e instanceof String)
                    throw new StringException();
            }
            for(int i=0;i<(arg.length*2)/3;i++){
                System.out.println(arg[i]);
            }
            System.out.println("Success!");
        }catch (StringException e){
            System.out.println(e);
            System.out.println("Not Success!");
        }

    }
}
public class Prog8 {
    public static void main(String[] args) {
        OnlyInt o=new OnlyInt();
        o.print(1,2,3,4,5,6);
        o.print(9,10,"String",11);
    }
}
