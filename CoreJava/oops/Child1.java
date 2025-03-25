package oops;

class GrandParent1{
	
	public void hello() { // void-dynamic
		System.out.println("Iam from the grandParent class");
	}
	
}

class Parent1 extends GrandParent1{
	
	public void hi() {  // void-dynamic
		System.out.println("Iam from the parent class");
	}
	
}

public class Child1 extends Parent1{
	
	public static void main(String[] args) {
		
		Child1 obj = new Child1();
		
		obj.hello();
		
		obj.hi();
		
		
	}

}
