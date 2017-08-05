package javaRelated;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriting {

	public static final String FILENAME = "D:\\selenium_training\\ReadThis.txt";
	
	public static void main(String[] args) {
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter = null;
		
		
		String content = "This is the content to write into file\n";
String secondLine="This is the second line";
		
		try {
			fileWriter= new FileWriter(FILENAME);
			
			bufferedWriter= new BufferedWriter(fileWriter);
			
			bufferedWriter.write(content);
			bufferedWriter.write(secondLine);
			bufferedWriter.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
