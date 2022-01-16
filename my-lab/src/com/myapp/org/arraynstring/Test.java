package com.myapp.org.arraynstring;

public class Test {
	
	public static void main(String args[]) {
		LRU lru=new LRU(2);
		lru.put("hello", "foo");
		lru.put("hello", "bar");
		lru.put("t1","foo");
		lru.put("t2","bar");
		
		System.out.println(lru);
	}

}
