package intro;

import java.util.Scanner;

public class InputEx {
	
	public static void main(String[] args) {
		
	Scanner	scan = new Scanner(System.in);
	
	System.out.print("Enter your age :- ");
	
	byte age = scan.nextByte();
	
	if(age>=18) {
		System.out.println("You are allowed to vote");
	}
	else {
		System.out.println("You are not allowed to vote");
	}
	
	
	
	
	}

}
