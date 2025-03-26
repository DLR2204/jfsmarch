package oops;

public class MethodOverloading {
	
	public void add(int a,int b) {
		System.out.println("6.The sum of 2 int's are:- "+(a+b));
	}
	public void add(int a,int b,int c) {
		System.out.println("9.The sum of 3 int's are:- "+(a+b+c));
	}
	
	public void add(float a,int b) {
		System.out.println("13.The sum of float,int are:- "+(a+b));
	}
	
	public void add(int a,float b) {
		System.out.println("17.The sum of 2 int,float are:- "+(a+b));
	}
	
	public void add(float a,float b) {
		System.out.println("21.The sum of 2 float's are:- "+(a+b));
	}
	
	public static void main(String[] args) {
	
		MethodOverloading obj = new MethodOverloading();
		
		obj.add(2,5);
		
		
		
	}

}
