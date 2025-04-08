package collection;

import java.util.TreeMap;

public class TreeMapEx {
	
	public static void main(String[] args) {
		
		TreeMap tm = new TreeMap();
		
		tm.put(105,"pear");
		
		tm.put(102,"hello");
		
		tm.put(100,3.14f);
		
		tm.put(101,true);
		
		tm.put(104,'c');
		
		System.out.println(tm.get(100));
		
		
	}

}
