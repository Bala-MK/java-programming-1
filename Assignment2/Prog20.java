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
    int size(){
        return size;
    }
    int getAt(int index){
        Node n=head;
        for(int i=0;i<index;i++){
            n=n.next;
        }
        return n.data;
    }
    void push_front(int i){
        head=new Node(i,head);
        size++;
    }
    int nElementFromLast(int i){
        return getAt(size()-i);
    }
    void print(){
        Node n=head;
        while(n!=null){
            System.out.print(n.data+"->");
            n=n.next;
        }
        System.out.println("NULL");
    }
}
public class Prog20 {
    public static void main(String[] args) {
        Linkedlist list=new Linkedlist();
        list.push_front(10);
        list.push_front(20);
        list.push_front(30);
        list.push_front(40);
        list.push_front(50);
        int i=4;
        if(i>list.size())
            return;
        list.print();
        System.out.println(list.nElementFromLast(i));
    }
}
