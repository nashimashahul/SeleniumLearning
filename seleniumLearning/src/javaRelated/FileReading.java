package javaRelated;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {

	public static final String FILENAME = "D:\\selenium_training\\ReadThis.txt";
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = null;
		FileReader fileReader = null;


		try {
			fileReader= new FileReader(FILENAME);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bufferedReader= new BufferedReader(fileReader);

		
		String currentLine;

		try {
			while((currentLine=bufferedReader.readLine())!= null){
				System.out.println(currentLine);
			}
			
			bufferedReader.close();
			bufferedReader=null;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {

			try {

				if(bufferedReader!=null)
					bufferedReader.close();

				if (fileReader != null)
					fileReader.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
	}
}