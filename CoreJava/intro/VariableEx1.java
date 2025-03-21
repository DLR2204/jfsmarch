package intro;

public class VariableEx1 {
	
		int number = 3234;  //instance global variable
		
		static String name = "apple";  //static global variable
	
	
	public static void main(String[] args) {
		
		
		VariableEx1 obj = new VariableEx1();//copy of class = object
		
		int value = 324;   //local variable
		
		
		System.out.println(value);
		
		System.out.println(obj.number);
		
		System.out.println(name);
	}
	
	

}
