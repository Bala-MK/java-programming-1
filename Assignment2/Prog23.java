package com.company.Assign2;

import java.util.Iterator;
import java.util.LinkedList;

class Graph{
    private int vertices;
    private LinkedList<Integer> list[];
    Graph(int v) {
        vertices = v;
        list = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            list[i] = new LinkedList<>();
        }
    }
    void add(int v, int w){
        list[v].add(w);
        list[w].add(v);
    }
    Boolean cycle(int v, int p, Boolean vs[]){
        vs[v]=true;
        Integer i;
        Iterator<Integer> it=list[v].iterator();
        while(it.hasNext()) {
            i = it.next();
            if (!vs[i]){
                if (cycle(i, v, vs))
                    return true;
            }
            else if(i!=p)
                return true;
        }
        return false;
    }
    Boolean isTree(){
        Boolean visited[]=new Boolean[vertices];
        for (int i = 0; i < vertices; i++) {
            visited[i]=false;
        }
        if(cycle(0,-1,visited))
            return false;
        for (int i = 0; i < vertices; i++) {
            if(!visited[i])
                return false;
        }
        return true;
    }
}
public class Prog23 {
    public static void main(String[] args) {
        Graph g1=new Graph(5);
        g1.add(1,0);
        g1.add(0,2);
        g1.add(0,3);
        g1.add(3,4);
        if(g1.isTree())
            System.out.println("Graph is Tree");
        else System.out.println("Graph is not a Tree");

        Graph g2=new Graph(5);
        g2.add(1,0);
        g2.add(0,2);
        g2.add(2,1);
        g2.add(0,3);
        g2.add(3,4);
        if(g2.isTree())
            System.out.println("Graph is Tree");
        else System.out.println("Graph is not a Tree");
    }
}
