package com.elearn;

/**
 * @author Temo chkhaidze
 */
public class Sorting {
    /**
     * This method sorts array
     * @param array Array to be sorted
     */
    public void sort(int[] array){
        if (array==null){
            throw new IllegalArgumentException();
        }
        int n = array.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
    }
}
