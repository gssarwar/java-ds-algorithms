package com.gs.sort.insertionsort;

import java.util.Arrays;

public class InsertionSort {
    
    public static int[] insertionsort(int[] array){

        for (int i = 1; i < array.length ; i++) {
            int j;
            int v = array[i];
            for ( j = i-1; j >=0  ; j--) {
                if (array[j] <= v)
                    break;
                array[j+1] = array[j];
            }
            array[j+1] = v ;
        }
        return array;
    }

    public static void main(String[] args) {

        int[] array ={7,8,6,3,9};
        int[] insertionsort = insertionsort(array);
        System.out.println(Arrays.toString(insertionsort));
    }
}
