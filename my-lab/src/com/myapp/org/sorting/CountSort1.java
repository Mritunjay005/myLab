package com.myapp.org.sorting;

import java.util.Arrays;

public class CountSort1 implements SortWReturnable{

    @Override
    public Integer[] sort(Integer[] arr) {
       
        Integer[] res=new Integer[arr.length];
        int max= Arrays.stream(arr).mapToInt(n->n).max().getAsInt();
        //int min= Arrays.stream(arr).mapToInt(n->n).min().getAsInt();

        Integer count[]=new Integer[max+1];
        Arrays.fill(count, 0);

        for (Integer integer : arr) {
            count[integer]=count[integer]+1;
        }
        int k=0;
         for (int i = 0; i < count.length; i++) {
             if(count[i]>0){
                 for (int j = 0; j < count[i]; j++) {
                     res[k++]=i;
                 }
             }
         }

        return res;
    }
    
}
