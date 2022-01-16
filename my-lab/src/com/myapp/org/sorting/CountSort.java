package com.myapp.org.sorting;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class CountSort implements SortWReturnable {

    @Override
    public Integer[] sort(Integer[] arr) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        Integer[] res=new Integer[arr.length];
        AtomicInteger count=new AtomicInteger(0);

        for ( int i = 0; i < arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }
        
         map.keySet().stream().sorted().forEach(n->{
           for (int j = 0; j < map.get(n); j++) {
               res[count.getAndIncrement()]=n;
           }
        });

        return res;
    }
    
}
