package collection;

import java.util.HashSet;

//Set:- 
//(1)Not allowing the duplicates
//
//(2)Not storing insertion order :- Random order


public class HashSetEx {
	
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		
		hs.add(1);

		hs.add("apple");

		hs.add(true);

		hs.add(3.14f);

		hs.add('c');

		hs.add(1);

		hs.add("apple");

		hs.add(true);

		hs.add(3.14f);

		hs.add('c');

		System.out.println(hs);

		hs.add("new");

		System.out.println(hs);
	}

}
