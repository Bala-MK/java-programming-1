package com.company.Assign2;

class Linkedlist{
    Node head;
    int size;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
        Node(int d, Node n){
            data=d;
            next=n;
        }
    }
    void push_front(int i){
        head=new Node(i,head);
        size++;
    }
    void print(){
        Node n=head;
        while(n!=null){
            System.out.print(n.data+"->");
            n=n.next;
        }
        System.out.println("NULL");
    }
    void reverse(){
        Node c=head;
        Node p=null;
        Node n=null;
        while (c!=null){
            n=c.next;
            c.next=p;
            p=c;
            c=n;
        }
        head=p;
    }
}
public class Prog21 {
    public static void main(String[] args) {
        Linkedlist list=new Linkedlist();
        list.push_front(10);
        list.push_front(20);
        list.push_front(30);
        list.push_front(40);
        list.push_front(50);

        list.print();
        list.reverse();
        list.print();
    }
}
