package com.sparta.mb;

import java.util.Arrays;

public class TimeCheck {
    void doTest(SortArray test, int[] array) {

        double start = System.nanoTime();
        test.run(array);
        System.out.println(Arrays.toString(array));
        double total = System.nanoTime() - start;
        System.out.println(total / 1000000 + "\n");
    }

    void doTestTree(SortTree test, Node node) {

        double start = System.nanoTime();
        test.run(node);
        double total = System.nanoTime() - start;
        System.out.println(total / 1000000 + "\n");
    }
}
