package com.myapp.org.arraynstring;

import java.util.TreeMap;

public class LRU extends TreeMap {
	private int cacheSize=4;
	
	LRU(int cacheSize){
		this.cacheSize=cacheSize;
	}
	
	public void put(String key,String value) {
		if(this.values().size() > cacheSize) {
			
		}else {
			super.put(key, value);
		}
	}
	

}
