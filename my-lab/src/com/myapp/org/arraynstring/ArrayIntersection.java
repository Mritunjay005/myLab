package com.myapp.org.arraynstring;

import java.util.ArrayList;
import java.util.List;

public class ArrayIntersection {
    private static List findIntersection(int[] arr1, int[] arr2, int size1, int size2){
        List<Integer> ans = new ArrayList<Integer>();
        int i=0;
        int j=0;
        while(i < size1 && j < size2 )
        {
            if(arr1[i] < arr2[j]){
                i++;
            }else if(arr1[i] > arr2[j]){
                j++;
            }else{
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }

        return ans;
    }
    public static void main(String[] args){
        // input array should be sorted
        int[] arr1 ={2,3,4,5,5,6,7};
        int[] arr2 ={1,5,5,6,7};
        findIntersection(arr1,arr2,7,5).stream().forEach(n -> System.out.println(n));
        //System.out.println(findIntersection(arr1,arr2,6,3));

    }
    
}
