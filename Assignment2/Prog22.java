package com.company.Assign2;

import java.util.Arrays;
import java.util.HashMap;

public class Prog22 {
    static void rank(int a[]){
        int[] arr=Arrays.copyOf(a,5);
        Arrays.sort(arr);
        HashMap<Integer,Integer> map=new HashMap<>();
        int rank=1;
        for (int i = 0; i < arr.length; i++) {
            int j=arr[i];
            if(map.get(j)==null){
                map.put(j,rank);
                rank++;
            }

        }
        for (int i = 0; i < a.length; i++) {
            a[i]=map.get(a[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={20,50,10,30,40,20};
        rank(arr);
        System.out.println(Arrays.toString(arr));
    }
}
