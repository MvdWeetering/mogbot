package codebase;

import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lijst {

	public static String[] HaalList() {

		String csvFile = "C://Testbestanden//list.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		String[] lijst = null;

		try {

			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {

				// use comma as separator
				lijst = line.split(cvsSplitBy);

				// System.out.println("Id=" + lijst[0] + ", Subject= " + lijst[1]) ;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return lijst;
	}

	public static void main(String[] args) {

		String[] invuldata = HaalList();

		System.out.println(invuldata[1]);

	}

}
