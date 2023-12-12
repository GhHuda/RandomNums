package finals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DictionaryReader {

	// Method to check if the file exists at the given path
	public static boolean doesFileExist(String path) {
		try {
			FileReader fileReader = new FileReader("src\\finals\\dictionary");
			fileReader.close();
			return true;
		} catch (IOException e) {
			return false;
		}
	}

	// Method to read and print words and their meanings from the file
	public static void readAndPrintDictionary(String path) {
		try (BufferedReader br = new BufferedReader(new FileReader("src\\finals\\dictionary"))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] parts = line.split(" - ");
				String word = parts[0].trim();
				String[] meanings = parts[1].split(", ");

				System.out.println(word);
				for (String meaning : meanings) {
					System.out.println(meaning);
				}
				System.out.println();
			}
		} catch (IOException e) {
			
		}
	}

	public static void main(String[] args) {
		String filePath = "src\\finals\\dictionary";

		if (doesFileExist(filePath)) {
			readAndPrintDictionary(filePath);
		} else {
			System.out.println("File does not exist at the specified path.");
		}
	}
}
