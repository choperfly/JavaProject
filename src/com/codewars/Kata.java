package com.codewars;

import java.util.ArrayList;
import java.util.Arrays;
public class Kata {
    public static int[] arrrayDiff(int[] a, int[] b){
        System.out.println("array A:" + Arrays.toString(a));
        System.out.println("Array B:" + Arrays.toString(b));
        if(a.length==0 || b.length==0) return a;
        ArrayList<Integer> newSeq = new ArrayList<Integer>();
        int count;
        for(int valA : a){
            count=0;
            for (int valB : b ){
                if(valA==valB) {
                    System.out.println("value found: valA:"+valA +" || valB"+valB);
                    count+=1;
                }
            }
            if(count==0) {
                System.out.println("adding valueA:" + valA);
                newSeq.add(valA);
            }
        }
        int[] arr = newSeq.stream().mapToInt(i -> i).toArray();
        System.out.println("Array Result:" + Arrays.toString(arr));
        return arr;
    }
}
