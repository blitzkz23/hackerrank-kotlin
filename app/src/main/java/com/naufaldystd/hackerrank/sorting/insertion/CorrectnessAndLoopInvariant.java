package com.naufaldystd.hackerrank.sorting.insertion;

public class CorrectnessAndLoopInvariant {
    /**
     * This problem is just to correct the wrong part of code, and no kotlin codebase available.  But im gonna save this code here as well.
     */

    public static void insertionSort(int[] A){
        for(int i = 1; i < A.length; i++){
            int value = A[i];
            int j = i - 1;
            while(j >= 0 && A[j] > value){
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = value;
        }
        printArray(A);
    }


    static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args) {
        insertionSort(new int[]  {7, 4, 3, 6, 5, 2});
    }
}
