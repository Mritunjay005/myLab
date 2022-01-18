package com.myapp.org.DP;


public class CoinChange {
    public int coinChange(int[] coins, int amount) {

        return coinChange(amount,coins,new int[amount+1]);
    }

    public int coinChangeWays(int[] coins, int amount) {
         int ways =0;
        return coinChangeWays(0,amount,coins,new int[coins.length+1][amount+1],ways);
    }

    private int coinChangeWays(int idx, int rem, int[] coins, int[][] dp, int ways) {

        if (rem == 0) {
            return ways + 1;
        }
        if (rem < 0) {
            return ways;
        }
        if (rem > 0 && dp[idx][rem]!=0) 
            return dp[idx][rem];

        for (int i=idx;i<coins.length ;i++ ){
            ways = coinChangeWays(i,rem - coins[i],coins,dp,ways);
        }
        dp[idx][rem]= ways;
        return dp[idx][rem];
    }

    private int coinChange(int rem, int[] coins, int[] dp) {
        if (rem == 0) return 0;
        if (rem < 0) return -1;
        if (dp[rem]!=0) return dp[rem];
        int min = 9999;
        for (int coin : coins) {
            int res = coinChange(rem - coin,coins,dp);
            if(res >=0 && res < min){
                min = res +1;
            }
        }
        dp[rem]= min == 9999? -1:min;
        return dp[rem];
    }
    
}
