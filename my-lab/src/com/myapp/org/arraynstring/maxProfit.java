package com.myapp.org.arraynstring;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class maxProfit {

    public static void main(String[] s) {
        int[] arr={10,20,1,3,7,7,7,7,9,10,15,17,19};
        //printArray(arr);
        System.out.println(maxOccurance(arr));
        System.out.println(maxProfit(arr));
        
    }

    public static void printArray(int[] arr){

        for (int i=0;i< arr.length ; i++){
            System.out.println(arr[i]);
        }


    }

    private static int maxOccurance(int[] arr) {
        int size=arr.length;
        int i=0;
        int j=0;
        int ans=0;
        int count=0;
        while (j < size){
            if(arr[i] == arr[j]){
                count++;
                j++;
                if(ans < count){
                    ans=count;
                }
            }else{
                i = j;
                count=0;
            }
        }
        return ans;
    }
// 10 2 3 20 2 2 1 1
    private static int maxProfit(int[] arr) {
        int size=arr.length;
        int j=0;
        int min=999999;
        int max=0;
        while (j < size){
            if(arr[j] < min){
                min=arr[j]; 
                j++;
            }
            int profit=arr[j]-min;
            if(profit > max){
                max=profit;
            }
            
            j++;
        }
        return max;
    }
}
