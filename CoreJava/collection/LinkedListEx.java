package collection;

import java.util.LinkedList;

//List:- 
//
//(1)It will allows duplicates
//
//(2)It will stores the insertion order

public class LinkedListEx {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		ll.add(1);

		ll.add("apple");

		ll.add(true);

		ll.add(3.14f);

		ll.add('c');

		ll.add(1);

		ll.add("apple");

		ll.add(true);

		ll.add(3.14f);

		ll.add('c');

		System.out.println(ll);

		ll.add("new");

		System.out.println(ll);

		
		
	}
}
