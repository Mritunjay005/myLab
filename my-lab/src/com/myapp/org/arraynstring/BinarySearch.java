package com.myapp.org.arraynstring;

public class BinarySearch {

    private static int binSearch(int[] arr, int key){
     int size=arr.length;
     int start=0;
     int end=size -1;
     int med = (start + end)/2;
     while (start < end){
         if (arr[med] == key){
             return med;
         }else if(arr[med] > key){
              end = med -1;
         }else if (arr[med] < key){
            start = med + 1;
         }
         med=(start + end)/2;
     }

    return size;
    }

    public static void main(String[] s) {
        int [] arr={1,1,3,7,9,10,15,17,19};
        System.out.println(binSearch(arr,15));
        
    }
    
}
