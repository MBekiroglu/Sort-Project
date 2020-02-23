package com.sparta.mb;

public class BubbleSort implements SortArray {

    @Override
    public int[] run(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;

                run(array);
            }
        }
        return array;
    }
}