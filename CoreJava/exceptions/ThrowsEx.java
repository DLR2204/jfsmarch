package exceptions;

import java.io.FileNotFoundException;

public class ThrowsEx {
	
	public static void div(int a,int b) throws ArithmeticException,FileNotFoundException{
		
		System.out.println(a/b);
	}

	public static void main(String[] args)  {
		
		try {
			div(12,0);
		} catch (ArithmeticException | FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
}
