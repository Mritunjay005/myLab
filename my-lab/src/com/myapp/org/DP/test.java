package com.myapp.org.DP;

public class test {

    public static void main(String[] args){
        // int[] candidates={10,1,2,7,6,1,5};
        // int target = 8;
        // Combination1 cm1= new Combination1();
        // System.out.println(cm1.solveWithoutRepeat(candidates, target).toString());

        int [] coins = {1,2,5};
        int target = 11;
        CoinChange cc = new CoinChange();
        System.out.println(cc.coinChangeWays(coins, target));
        
    }
    
}
