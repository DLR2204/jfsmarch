package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\March.txt");
		
		fw.write(1234);
		
//		fw.write(true);
//		
//		fw.write(3.14f);
		
		fw.write("good morning");
		
		char ch[] = {'a','b','c','d'};
		
		fw.write(ch);
		
		
		fw.flush();
		
		fw.close();
		
		System.out.println("Data is written into the file successfully");
	}

	//it will not accept boolean , float dt's
	
	//It can't read the integer values
	
	//no new line option 
}
