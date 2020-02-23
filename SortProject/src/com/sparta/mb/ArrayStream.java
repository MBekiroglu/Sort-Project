package com.sparta.mb;

import java.util.Arrays;

public class ArrayStream implements SortArray {

    @Override
    public int[] run(int[] array) {
        Arrays.stream(array)
                .sorted()
                .toArray();
        return array;
    }
}
