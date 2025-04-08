package collection;

import java.util.LinkedHashSet;

//Set:- 
//(1)Not allowing the duplicates
//
//(2)storing insertion order 

public class LinkedHashSetEx {
	
	public static void main(String[] args) {
		
		LinkedHashSet lhs =new LinkedHashSet();
		
		lhs.add(1);

		lhs.add("apple");

		lhs.add(true);

		lhs.add(3.14f);

		lhs.add('c');

		lhs.add(1);

		lhs.add("apple");

		lhs.add(true);

		lhs.add(3.14f);

		lhs.add('c');

		System.out.println(lhs);

		lhs.add("new");

		System.out.println(lhs);
	}

}
