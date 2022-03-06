import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

class ReadFromFile {
	public void readFile() {
		try {
			// Create f1 object of the file to read data
			File f1 = new File("C:\sample.txt");
			Scanner dataReader = new Scanner(f1);
			while (dataReader.hasNextLine()) {
				String fileData = dataReader.nextLine();
				System.out.println(fileData);
			}
			dataReader.close();
		} catch (FileNotFoundException exception) {
			System.out.println("Unexcpected error occurred!");
			exception.printStackTrace();
		}
	}
}

class WriteToFile {
	public void writeFile(String msg) {
		try {
			FileWriter fwrite = new FileWriter("C:\sample.txt");
			// writing the content into the Sample.txt file
			fwrite.write(msg);
			// Closing the stream
			fwrite.close();
			System.out.println("Content is successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("Unexpected error occurred");
			e.printStackTrace();
		}
	}
}

class AppendToFileExample {
	public void appendFile(String msg) {
		try {
			String data = msg;
			File f1 = new File("C:\sample.txt");
			if (!f1.exists()) {
				f1.createNewFile();
			}
			FileWriter fileWritter = new FileWriter(f1.getName(), true);
			BufferedWriter bw = new BufferedWriter(fileWritter);
			bw.write(data);
			bw.close();
			System.out.println("Done");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

public class FileHandling {
	public static void main(String[] args) {
		char choice;
		String msg;
		Scanner sc = new Scanner(System.in);
		do {
			System.out
					.println("\nMain Menu : \n1. Reading the File\n2. Writing to File\n3. Appending to File\n4. Exit");
			System.out.print("Enter your choice : ");
			choice = sc.next().charAt(0);
			switch (choice) {
			case '1':
				ReadFromFile obj = new ReadFromFile();
				obj.readFile();
				break;
			case '2':
				WriteToFile obj1 = new WriteToFile();
				msg = "A named location used to store related information is referred to as a File.";
				obj1.writeFile(msg);
				break;
			case '3':
				AppendToFileExample obj2 = new AppendToFileExample();
				msg = "Your time is limited, so don’t waste it living someone else’s life. Don’t be trapped by dogma – which is living with the results of other people’s thinking.";
				obj2.appendFile(msg);
				break;
			case '4':
				System.out.println("Thank you...");
				System.exit(0);
				break;
			default:
				System.out.println("Wrong Choice!!!");
				break;
			}
		} while (choice != 4);
	}
}
