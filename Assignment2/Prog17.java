package com.company.Assign2;

import java.util.Stack;

public class Prog17 {
    static Stack<Integer> sortstack(Stack<Integer> stack){
        Stack<Integer> t = new Stack<>();
        while(!stack.isEmpty()){
            int tmp = stack.pop();
            while(!t.isEmpty() && t.peek()>tmp){
                stack.push(t.pop());
            }
            t.push(tmp);
        }
        return t;
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.add(20);
        s.add(10);
        s.add(50);
        s.add(40);
        s.add(30);

        Stack<Integer> t=sortstack(s);
        System.out.print("Top");
        while (!t.empty()){
            System.out.print("<-"+t.pop());
        }

    }
}
