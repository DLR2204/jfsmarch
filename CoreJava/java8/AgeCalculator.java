package java8;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class AgeCalculator {
	
	public static void main(String[] args) {
	
		
		LocalDate today = LocalDate.now();
		
		System.out.println(today);
		
		LocalDate birthdate = LocalDate.of(2020,01,01);
		
		Period p = Period.between(birthdate, today);
		
		System.out.printf("Your Age is :- %d years %d months %d days",p.getYears(),p.getMonths(),p.getDays());
		
		
//		static prop's cant be overrided	
		}

}
