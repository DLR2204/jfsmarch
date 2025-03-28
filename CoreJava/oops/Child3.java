package oops;

class MethodOverriding{
	
	public void display() {
		System.out.println("Iam from the parent class");
	}
	
	public void add(int a,int b) {
		System.out.println(a*b);
	}
	
}

public class Child3 extends MethodOverriding{
	
	public static void main(String[] args) {
		
		Child3 obj = new Child3();
		
		obj.display();
		
		obj.add(3, 8);
	}
	
	@Override
	public void add(int a,int b) {
		System.out.println(a+b);
	}

}
