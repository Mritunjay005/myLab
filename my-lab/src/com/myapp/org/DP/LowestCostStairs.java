package com.myapp.org.DP;

class LowestCostStairs {

    public static void main(String[] args){
       Integer stairs[]= {10,2,15,20,1,1,1};

       
       //System.out.println("Fib(n) " + fibonacci(44));
        System.out.println("lowest Cost" + lowestCost(stairs,7));
    }


    private static int lowestCost(Integer[] stairs, int n) {
        int sum=0;
        if (n < 2)
            return 0;
        
        int step1 = stairs[n-1]+lowestCost(stairs,n-1);
        int step2 = stairs[n-2]+lowestCost(stairs,n-2);
        sum=sum+Math.min(step1,step2);
        return sum;
    }
}