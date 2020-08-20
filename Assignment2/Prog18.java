package com.company.Assign2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Prog18 {
    static void reverse(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.add(queue.remove());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        reverse(q);

        while (!q.isEmpty()) {
            System.out.print(q.remove()+" ");
        }
    }
}
