import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite{
	
	public static void main(String[] args){
		
		String fileName = "awesome.car";
		String data = "Blah, blah, blah.";
		
		
		// Create a file
		
		try {
			
			File mFileX = new File(fileName);
			
			if (mFileX.createNewFile()) {
				
				System.out.println("File created successful: " + mFileX.getName());
				
			} else {
				
				System.out.println("File already exists.");
				
			}
			
		} catch (IOException e) {
			
			System.out.println("Could not create file.");
		}

		// Write to a file
		
		
		try {
			
			FileWriter writer = new FileWriter(fileName);
			writer.write(data);
			writer.close();
			System.out.println("Write to file successful: " + data);
			
		} catch (IOException e) {
			
			System.out.println("Could not write to file.");
			e.printStackTrace();
		}

		// Read from file

		try {
			
			File mFileY = new File(fileName);
			Scanner mReader = new Scanner(mFileY);
			
			
			while (mReader.hasNextLine()) {
				
				data = mReader.nextLine();
				System.out.println("Read from file successful: " + data);
			}
			mReader.close();
			
		} catch (FileNotFoundException e) {
			
			System.out.println("Could not find file.");
			e.printStackTrace();
			
		}
	
		
	}
	
	
}