package intro;

public class MethodEx {
	
	public void display() {                  //void-dynamic
		System.out.println("Hello Everyone...");
	}
	
	public static int add(int a,int b) {            //int-static
		
		return (a+b);
		
	}
	
	public static void main(String args[]) {         //void-static
		
		System.out.println(MethodEx.add(34, 23));
		
		MethodEx obj = new MethodEx();
		
		obj.display();
		
	}

}
