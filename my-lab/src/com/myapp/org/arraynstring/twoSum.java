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
	
	public static void main(String[]args) {
		Integer[] num= {1,2,4,6};
		int target=5;
	    Arrays.asList(twoSum(num, target)).stream().forEach(n->System.out.println(n));
	}
}
