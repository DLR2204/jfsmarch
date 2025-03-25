package oops;

interface ParentA{
	
	public void display();
	
}

interface ParentB{
	
	public void display();
	
}


public class ChildC implements ParentA,ParentB{

	@Override
	public void display() {
		
		System.out.println("Hello Everyone.....");
		
	}
	
	public static void main(String[] args) {
		
		ChildC obj = new ChildC();
		
		obj.display();
	}
	
	

}
