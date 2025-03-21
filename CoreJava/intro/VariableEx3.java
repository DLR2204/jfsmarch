package intro;

public class VariableEx3 {
	
	static String nationality = "Indian"; //static g.v
	
	int aadhar = 500; //instance g.v
	
	public void display() {
		
		System.out.println("Nationality:- "+ nationality +"\t" +"Aadhar Number:-"+aadhar);
		
	}
	
	
	public static void main(String[] args) {
		
		VariableEx3 ramesh = new VariableEx3();
		
		VariableEx3 suresh = new VariableEx3();
		
		VariableEx3 mahesh = new VariableEx3();
		
		ramesh.aadhar = 100;suresh.aadhar=200;
		
		
		ramesh.nationality = "American";
		
		System.out.print("Ramesh:- ");
		
		ramesh.display();
		
		System.out.print("Suresh:- ");
		
		suresh.display();
		
		System.out.print("Mahesh:- ");
		
		mahesh.display();
		
	}

}
