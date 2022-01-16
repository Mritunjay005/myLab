package com.myapp.org.arraynstring;

import java.util.Arrays;
import java.util.List;

public class LCP {
	
	public static String getLcp(String[] str,String prefix) {
		  boolean flag = true;
		  List<String> strList=Arrays.asList(str);
		  for(String str1:strList) {
			  if(!str1.startsWith(prefix)) {
				  flag=false;
				  break;
			  } 
		  }
		if(flag) {
			return prefix;
		}else {
			return getLcp(str,prefix.substring(0, prefix.length()-1));
		}
	}
	
	public static void main(String args[]) {
		String[] str= {"leet-","leetcode","leetwork","lee"};
		String prefix=str[0];
		System.out.println(getLcp(str,prefix));
		
	}

}
