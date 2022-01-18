package com.myapp.org.DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//no of way to get targer. repetation allowed
public class Combination1 {
    List<List<Integer>> res=new ArrayList<List<Integer>>();
    List<Integer> curr = new ArrayList<Integer>();
    int target=0;

    public List<List<Integer>> solve(int[] nums,int target){
        this.target=target;
        CombinationSum(0,nums,target);
        return res;

    }

    public List<List<Integer>> solveWithoutRepeat(int[] nums,int target){
        this.target=target;
        Arrays.sort(nums);
        CombinationSumWRepeat(0,nums,target);
        return res;

    }

    private void CombinationSum(int idx, int[] nums, int rem) {
        if (rem == 0){
            res.add(new ArrayList<Integer>(curr));
            return;
        }else if(rem < 0 || idx > nums.length){
            return;
        }
       for (int i= idx;i< nums.length;i++){
           curr.add(nums[i]);
           CombinationSum(i,nums,rem - nums[i]);
           curr.remove(curr.size() -1);
       }
    }

    private void CombinationSumWRepeat(int idx, int[] nums, int rem) {
        if (rem == 0){
            res.add(new ArrayList<Integer>(curr));
            return;
        }else if(rem < 0 || idx > nums.length){
            return;
        }
       for (int i= idx;i< nums.length;i++){
           if(i > idx && nums[i-1]==nums[i]){
               continue;
           }
           if(nums[i]> rem){
            break;
           }
           curr.add(nums[i]);
           CombinationSumWRepeat(i+1,nums,rem - nums[i]);
           curr.remove(curr.size() -1);
           
       }
    }
    
}
