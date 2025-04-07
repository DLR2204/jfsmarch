package collection;

import java.util.ArrayList;

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

	}
}
