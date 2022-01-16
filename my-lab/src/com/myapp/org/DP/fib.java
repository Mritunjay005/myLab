package com.myapp.org.DP;

import java.util.HashMap;
import java.util.Map;

// 0 1 1 2 3 5 8
class fib {

    private static int fibonacci(int n){
        if (n < 2){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    private static int fibWMem(int n){
        if (n < 2){
            return n;
        }
        return getFromCache(n-1) + getFromCache(n-2);
    }

    private static int getFromCache(int i) {
        Map<Integer,Integer> map= new HashMap<Integer,Integer>();
        if (!map.containsKey(i)){
            map.put(i,fibonacci(i));
        }
        return map.get(i);
    }

    public static void main(String[] args){
       
       //System.out.println("Fib(n) " + fibonacci(44));
        System.out.println("FibWm(n) " + fibonacci(44));
    }
}