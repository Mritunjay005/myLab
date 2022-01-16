package com.myapp.org.arraynstring;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

// The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different.

// It is guaranteed that the number of unique combinations that sum up to target is less than 150 combinations for the given input.
public class CombinationSum1 {

    List<Integer> cur=new ArrayList<Integer>();
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    int target=0;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.target=target;

        combinationSum(0,candidates,0);

        return res;
      
    }

    private void combinationSum(int i, int[] candidates, int total) {

        if (i >= candidates.length || total > target)
            return;
        if( total == target){
            res.add(new ArrayList<Integer>(cur));
            return;
        }

        cur.add(candidates[i]);
        combinationSum(i,candidates,total+candidates[i]);
        cur.remove(cur.size()-1);
        
        combinationSum(i+1,candidates,total);

    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        this.target = target;
        cs(0,candidates,0); 
        return res;
    }
    
    private void cs(int counter, int[] candidates, int total){

        if (total == target){
            res.add(new ArrayList<Integer>(cur));
            return;
        }
        else if (counter > candidates.length || total > target){
            return;
        } 
       for (int i = counter; i < candidates.length ; i++) {
        if(i > counter && candidates[i-1]==candidates[i])
            continue;
        cur.add(candidates[i]);
        cs(i+1,candidates,total+candidates[i]);
        cur.remove(cur.size()-1);
        } 
    }

    public static void main(String[] s){
        int[] candidates={10,1,2,7,6,1,5};
        Arrays.sort(candidates);

        int target=10;
        new ArrayList<Integer>().add(target);
        CombinationSum1 sm=new CombinationSum1();

        System.out.println(sm.combinationSum2(candidates, target).toString());
    }

}
