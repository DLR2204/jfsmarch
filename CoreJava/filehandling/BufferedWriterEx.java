package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\March.txt");

		BufferedWriter bw = new BufferedWriter(fw);

		bw.write(1234);
		
		bw.newLine();

//		bw.write(true);
//		
//		bw.write(3.14f);

		bw.write("good morning");
		
		bw.newLine();

		char ch[] = { 'a', 'b', 'c', 'd' };

		bw.write(ch);

		bw.flush();

		bw.close();

		System.out.println("Data is written into the file successfully");

	}
	//it will not accept boolean , float dt's
	
		//It can't read the integer values
		
		
}
