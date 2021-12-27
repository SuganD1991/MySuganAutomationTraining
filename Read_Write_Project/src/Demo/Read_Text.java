package Demo;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class Read_Text {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader file = new FileReader("C:\\Users\\sugandharaj.c\\eclipse-workspace\\Read_Write_Project\\Files\\firstoutput.txt");
		BufferedReader read = new BufferedReader(file);
		String text;
		while((text=read.readLine())!=null) {
			System.out.println(text);
			}
		read.close();
	}

}
