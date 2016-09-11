package com.salmaan.twoseventythree;

import java.util.HashMap;

public class Collections {

	public static HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
	
	public void add(Integer id, String name){
		
		hashmap.put(id, name);
	}
	
	public String remove(Integer id){
		
		return hashmap.remove(id);
	}
	
	public String display(Integer id){
		
		return hashmap.get(id);
		
	}
	
}
