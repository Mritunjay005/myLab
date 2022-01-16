package com.myapp.org.sorting;

import java.util.Arrays;

public class Test {
    public static void main(String[] args){
        Integer[] nums ={3,1,5,7,2,6,0,2,2,5,3};
        int[] num ={3,1,5,7,2,0};

       // BubbleSort bs = new BubbleSort();
        // SelectionSort ss = new SelectionSort();
        // ss.sort(num);
        // System.out.println(Arrays.toString(num));
        // InsertionSort is = new InsertionSort();
        // mergeSort ms = new mergeSort();
        CountSort1 cs = new CountSort1();
        Integer[] nums_ret=cs.sort(nums);
       System.out.println(Arrays.toString(nums_ret));
    }
}
