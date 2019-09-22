package com.arjun.algorithm;

import com.arjun.algorithm.sort.MergeSort;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main (String args[]) {
        Integer [] abc = {5,4,3,2,1};
        MergeSort ms = new MergeSort(abc);
        System.out.println("result");
        Arrays.stream(ms.mergeSort()).forEach(System.out :: print);
        System.out.println();
    }

}
