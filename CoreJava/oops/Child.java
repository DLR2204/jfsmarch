package oops;

class Parent{
	
	public void display() {    //void-dynamic
		System.out.println("Hello Everyone...Im from the parent class");
	}
	
	public int add(int a,int b) {  //int
		return a+b;
	}
	
}

public class Child extends Parent{
	
	public static void main(String[] args) {
		
		Child obj = new Child();
		
		obj.display();
		
		System.out.println(obj.add(23, 34));
		
	}

}
