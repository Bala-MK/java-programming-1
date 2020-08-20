package com.company.Assign2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Prog19 {
    static void reverseKElements(Queue<Integer> queue,int i){
    if(queue.isEmpty()==true||i> queue.size()||i<1)
        return;

    Stack<Integer> stack=new Stack<>();
    for(int j=0;j<i;j++)
        stack.push(queue.remove());

    while (!stack.isEmpty())
        queue.add(stack.pop());

    for(int j=0;j<queue.size()-i;j++)
        queue.add(queue.remove());
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        int i=3;
        reverseKElements(q,i);

        while (!q.isEmpty()) {
            System.out.print( q.peek()+" ");
            q.remove();
        }
    }
}
