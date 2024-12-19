package com.day10;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashTable {

	public static void main(String[] args) {
		Map<Integer, String> map = new Hashtable<>();
		map.put(10, "Shobana");
		map.put(104, "latha");
		map.put(4, "latha");
		//map.put(null, null);
		map.put(2, "Pragathy");
		map.put(5, "Europe");
		map.put(3, "Hemalatha");
		map.put(7, "latha");
		
		map.remove(4);
		
		System.out.println(map);
		
		System.out.println(map.get(2));//value 
		
		System.out.println(map.size());//size of key value pair
		System.out.println(map.isEmpty());//false
		System.out.println(map.containsKey(104));//true
		System.out.println(map.containsValue("Shobana"));//true
		
		
		//way-1
		System.out.println("using for loop");
		Set <Integer> keys = map.keySet();
		System.out.println(keys);
		for( Integer key : keys) {
			System.out.println(key + " ==> "+map.get(key));
		}
		
		
		System.out.println("using iterator function");
		Iterator<Integer> it = keys.iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println(key + " ==> "+map.get(key));
			
		}
		
		//way-2
		Set<Entry<Integer,String>> entries = map.entrySet();
		System.out.println(entries);
		for(Entry<Integer,String> entry : entries) {
			System.out.println(entry.getKey() +"=>"+ entry.getValue());	
		}
		Iterator<Entry<Integer,String>> entry1 = entries.iterator();
		while(entry1.hasNext()) {
			Entry<Integer, String> entry = entry1.next();
			System.out.println(entry.getKey() + " ==> "+entry.getValue());
			
		}
		
		

	}

}
