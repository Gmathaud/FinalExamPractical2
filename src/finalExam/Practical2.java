package finalExam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Practical2 {

	public static void main(String[] args) {
		String filePath = "src\\finalExam\\dictionary.txt"; // Replace this with the actual path

		doesFileExist(filePath);
		System.out.println("=================================");
		readTextFile(filePath);
	}

	public static void doesFileExist(String path) {
		try {
			File file = new File(path);

			if (file.exists() && file.isFile()) {
				System.out.println("The file '" + path + "' exists.");
			} else {
				System.out.println("The file '" + path + "' does not exist.");
			}
		} catch (Exception e) {
			System.out.println("An error occurred: " + e.getMessage());
		}
	}

	public static void readTextFile(String path) {
		try {
			File f = new File(path);
			FileReader fr = new FileReader(f);
			BufferedReader r = new BufferedReader(fr);

			String line = null;
			while ((line = r.readLine()) != null) {
				System.out.println(line);

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
