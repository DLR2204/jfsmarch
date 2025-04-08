package collection;

import java.util.ArrayList;

//List:- 
//
//(1)It will allows duplicates
//
//(2)It will stores the insertion order

public class ArrayListEx {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add(1);

		al.add("apple");

		al.add(true);

		al.add(3.14f);

		al.add('c');

		al.add(1);

		al.add("apple");

		al.add(true);

		al.add(3.14f);

		al.add('c');

		System.out.println(al);

		al.add("new");

		System.out.println(al);
		
		for(Object obj:al) {
			System.out.println(obj);
		}

	}
}
