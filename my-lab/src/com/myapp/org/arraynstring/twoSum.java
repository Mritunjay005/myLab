package com.myapp.org.arraynstring;
import java.util.*;

public class twoSum {
	
	public static Integer[] twoSum(Integer[] num, Integer target) {
		Map <Integer,Integer> map=new HashMap();
		for (int i=0;i<num.length;i++) {
			Integer tar = target-num[i];
			if(map.containsKey(tar)) {
				return new Integer[] {map.get(tar),i};
			}
			map.put(num[i],i);
		}
	
		return null;
	}

	public static List<List<Integer>> twoSum1(Integer[] num, Integer target) {
		int i=0;
		int j=num.length - 1;
		List<List<Integer>> res= new ArrayList<List<Integer>>();
		while (i<j){
			if (num[i]+num[j] > target){
				j--;
			}else if(num[i]+num[j] < target){
				i++;
			}else{
				List<Integer> list = new ArrayList<Integer>();
				list.add(num[i]);
				list.add(num[j]);
				res.add(list);
				i++;j--;
			}
		}
	   return res;
	}

	public static List<List<Integer>> threeSum(Integer[] num, Integer tar) {
		int i=0;
		int j=num.length - 1;
		List<List<Integer>> res= new ArrayList<List<Integer>>();
		for (int k = 0; k < num.length -2; k++) {
	        i = k+1;
			int target = tar - num[k];
			while (i<j){
				if (num[i]+num[j] > target){
					j--;
				}else if(num[i]+num[j] < target){
				i++;
			}else{
				List<Integer> list = new ArrayList<Integer>();
				list.add(num[k]);
				list.add(num[i]);
				list.add(num[j]);
				res.add(list);
				i++;j--;
			}
		}
	}
	   return res;
	}


	
	public static void main(String[]args) {
		Integer[] num= {-1,0,1,1,2,4,6,6,7};
		int target=6;
	   // Arrays.asList(twoSum(num, target)).stream().forEach(n->System.out.println(n));\
		//System.out.println(twoSum1(num, target).toString());
		System.out.println(threeSum(num, target).toString());
	}
}
