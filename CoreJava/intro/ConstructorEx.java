package intro;

public class ConstructorEx {

	public ConstructorEx() { // default constructor
		System.out.println("6.Iam from the default constructor");

	}

	public ConstructorEx(String name) { // parametrized constructor

		System.out.println("12.Iam from the parametrized consturctor");

		System.out.println("14.My name is :- " + name);
	}

	public static void main(String[] args) {

		ConstructorEx obj = new ConstructorEx("apple"); // initializing the obj

	}
}
