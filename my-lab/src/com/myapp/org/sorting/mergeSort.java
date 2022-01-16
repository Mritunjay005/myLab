package com.myapp.org.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class mergeSort implements SortWReturnable {

    @Override
    public Integer[] sort(Integer[] arr) {
        // TODO Auto-generated method stub
        int size= arr.length;
        int mid= (0 + size)/2;
        List<Integer> list = Arrays.stream(arr).collect(Collectors.toList());
        List<Integer> left = list.subList(0, mid);
        List<Integer> right = list.subList(mid,size);

        Collections.sort(left);
        Collections.sort(right);
        List <Integer> finalList= new ArrayList<Integer>();
        int i =0;
        int j=0;
        int k=0;
        
        while (k < size){
            if(i >= left.size() ){
                finalList.add(right.get(j));
                j++;
            }else if(j >= right.size() ){
                finalList.add(left.get(i));
                i++;
            }else if(left.get(i) <= right.get(j) ){
                finalList.add(left.get(i));
                i++;
            }else{
                finalList.add(right.get(j));
                j++;
            }
            k++;
        }
  
        //finalList.forEach(System.out::println);
        return finalList.toArray(new Integer[0]);
        
    }
    
}
