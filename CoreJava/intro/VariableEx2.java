package intro;

public class VariableEx2 {
	
	static int staticCounter; //static global variable
	
	int instanceCounter;  //instance global variable
	
	public void counter() {
		
		staticCounter++;
		
		instanceCounter++;
	}
	
	public void display() {
		
		System.out.println("StaticCounter :- " + staticCounter);
		
		System.out.println("InstanceCounter :- " + instanceCounter);
	}

	
	public static void main(String[] args) {
		
		 VariableEx2 obj1 = new  VariableEx2();
		 
		 VariableEx2 obj2 = new  VariableEx2();
		 
		 VariableEx2 obj3 = new  VariableEx2();
		 
		 obj1.counter();
		 
		 obj2.counter();
		 
		 obj3.counter();
		 
		 obj3.counter();
		 
		 obj3.display();
		 
		 
		 
		 
	}
}
