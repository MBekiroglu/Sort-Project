package com.sparta.mb;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] array1 = new int[]{1, 5, 4, 2, 1, 7, 8};
        int[] array2 = new int[]{1, 3, 5, 8, 9, 14};

        BubbleSort bubbleSort = new BubbleSort();
        MergeSort mergeSort = new MergeSort();
        ArrayStream arrayStream = new ArrayStream();
        BinaryTree binaryTree = new BinaryTree(array1[0]);
        for (int i = 1; i < array1.length; i++) {
            binaryTree.addElement(array1[i], binaryTree.root);
        }
        TimeCheck timeCheck = new TimeCheck();



        System.out.println("Bubblesort");
        timeCheck.doTest(bubbleSort, array1);

        System.out.println("MergeSort");
        timeCheck.doTest(mergeSort, array2);

        System.out.println("Stream");
        timeCheck.doTest(arrayStream, array1);

        System.out.println("BinaryTree");
        timeCheck.doTestTree(binaryTree, binaryTree.root);
    }
}