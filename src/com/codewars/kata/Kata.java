package com.codewars.kata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.
 *It should remove all values from list a, which are present in list b keeping their order.
 *Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
 *If a value is present in b, all of its occurrences must be removed from the other:
 *Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}
 */
public class Kata {
    //my code
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

    //best code from the place
    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
        listA.removeAll(listB);
        return listA.stream().mapToInt(e -> e).toArray();
    }
}
