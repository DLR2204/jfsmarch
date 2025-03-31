package exceptions;

public class ThrowEx {
	
	public static  void vote(int age) {
		
		if(age>18) {
			System.out.println("You can procced to vote");
		}
		
		else {
			throw new NullPointerException("You age is less ");
		}
	}
	
	public static void main(String[] args) {
		
		
		vote(2);
		
		System.out.println("helllo everyone");
		
	}

}
