import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {

	public static void main(String[] args) {
		

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
			writer.write("Writting to a file.");
			writer.write("\nHere is another line.");

			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	try {
		BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
		String line;
		while((line=reader.readLine())!= null) {
			System.out.println(line);
		}
		reader.close();
	} catch (IOException e) {
		e.printStackTrace();
	}	
	
	
	
	
	
	}

}
