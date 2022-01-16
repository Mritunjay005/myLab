package com.myapp.org.arraynstring;

import java.util.Arrays;

public class Panildrome {
	public static boolean isPanildrome(String s) {
        String trimstr=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(trimstr.length());
		for (int i=0; i< trimstr.length()/2;i++) {
			if(trimstr.substring(i, i+1).equals((trimstr.substring(trimstr.length()-i-1, trimstr.length()-i)))){
				continue;
			}else {
				return false;
			}
		}
		return true;
    }
	
	
	public static boolean isPanildrome1(String s) {
        String trimstr=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char ch[]=trimstr.toCharArray();
        System.out.println(ch.length);
        for (int i=0; i<ch.length/2;i++) {
        	if (ch[i] == ch[ch.length-i-1]) {
        		continue;
        	}else {
        		return false;
        	}
        }
//		for (int i=0; i< trimstr.length()/2;i++) {
//			if(trimstr.substring(i, i+1).equals((trimstr.substring(trimstr.length()-i-1, trimstr.length()-i)))){
//				continue;
//			}else {
//				return false;
//			}
//		}
		return true;
    }

	public static void main(String[]args) {
		String str= "A man a plan a canal: Panama";
		System.out.println(isPanildrome(str));
		System.out.println(isPanildrome1(str));
		
	   
	}

}
