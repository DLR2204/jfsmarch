package filehandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterEx {

	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter pw = new PrintWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\March.txt");
		
		pw.println(1234);
		
		pw.println(true);
		
		pw.println('c');
		
		char ch[] = {'f','s','s'};
		
		pw.println(ch);
		
		pw.flush();
		
		pw.close();
		
		System.out.println("data is written into the file successfully");
	}
}
