package intro;

public class StringEx1 {
	
	public static void main(String[] args) {
		
		String name  ="apple";
		
		String name1 = "apple";
		
		System.out.println(name.compareTo(name1));//0
		
		System.out.println(name == name1);//true

		System.out.println(name.equals(name1));//true
		
		
		System.out.println("*******************");
		
		String name2 = new String("apple");
		
		String name3 = new String("apple");
		
		System.out.println(name2.compareTo(name3)); //0
		
		System.out.println(name2 == name3);//0,false
		
		System.out.println(name2.equals(name3));//0,true
	}

}
