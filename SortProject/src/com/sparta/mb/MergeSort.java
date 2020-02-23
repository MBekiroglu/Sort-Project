package com.sparta.mb;

import java.util.Arrays;

public class MergeSort implements SortArray {

    @Override
    public int[] run(int[] arr) {
        int[] l = Arrays.copyOfRange(arr, 0, arr.length / 2);
        int[] r = Arrays.copyOfRange(arr, arr.length / 2, arr.length);

        if (arr.length > 1) {
            l = run(l);
            r = run(r);
        }
        return mergeSorter(l, r);
    }

    public int[] mergeSorter(int[] a, int[] b) {
        int aPointer = 0;
        int bPointer = 0;
        int cPointer = 0;

        int[] merge = new int[a.length + b.length];

        //the && means that once one a or b exceed the length it'll break
        while (aPointer < a.length && bPointer < b.length) {
            if (a[aPointer] < b[bPointer]) {
                merge[cPointer] = a[aPointer];
                aPointer++;
                cPointer++;
            } else {
                merge[cPointer] = b[bPointer];
                bPointer++;
                cPointer++;
            }
        }
        if (bPointer < b.length) {
            while (bPointer < b.length) {
                merge[cPointer] = b[bPointer];
                bPointer++;
                cPointer++;
            }
        } else if (aPointer < a.length) {
            while (aPointer < a.length) {
                merge[cPointer] = a[aPointer];
                aPointer++;
                cPointer++;
            }
        }
        return merge;
    }
}


