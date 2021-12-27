package Demo;

import java.io.FileWriter;
import java.io.IOException;

public class Write_Text {

	public static void main(String[] args) throws IOException {
		FileWriter file = new FileWriter("C:\\Users\\sugandharaj.c\\eclipse-workspace\\Read_Write_Project\\Files\\firstoutput.txt", true);
		file.write("Welcome!!!");
		file.write("\n");
		file.write("I just created my very first file using Java");
		file.close();
		System.out.println("File creation successful");
	}

}
