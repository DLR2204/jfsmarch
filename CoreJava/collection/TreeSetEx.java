package collection;

import java.util.TreeSet;

//Set:- 
//(1)Not allowing the duplicates
//
//(2)Not storing insertion order :-AlphabeticalOrder/Ascending order

public class TreeSetEx {

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<String>();

		ts.add("carrot");

		ts.add("grapes");

		ts.add("mangoes");

		ts.add("apple");

		ts.add("bananas");

		ts.add("pear");

		ts.add("carrot");

		ts.add("grapes");

		ts.add("mangoes");

		ts.add("apple");

		ts.add("bananas");

		ts.add("pear");

		System.out.println(ts);

		for (String obj : ts) {
			System.out.println(obj);
		}

	}

}
