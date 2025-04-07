package exceptions;

class AgeNotValidException extends Exception {

	private int age;

	public AgeNotValidException(int age) {
		this.age = age;
	}
	
//	@Override
//	public String toString() {
//		
//		return   age + "is less than 18";
//	}

	

}

public class Test {

	public static void valid(int age) throws AgeNotValidException {
			
		if(age<18) {
		throw new AgeNotValidException(age);}
		
		else {
			System.out.println("You are eligible to vote");
		}
	}
	public static void main(String[] args) throws AgeNotValidException {
		
		valid(10);
		
	}

	
	
	
}
