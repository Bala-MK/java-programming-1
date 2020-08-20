package com.company.Assign2;

import java.util.Arrays;

public class Prog24 {
    static int kthsmallest(int[] a,int k){
        Arrays.sort(a);
        return a[k-1];
    }
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        int k=3;
        System.out.println(kthsmallest(a,k));
    }
}
