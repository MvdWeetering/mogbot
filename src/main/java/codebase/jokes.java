package codebase;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class jokes {

	public static String loadJoke() {

		int i = 0;
		String csvFile = "C:/mogbot/jokes.csv";
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(csvFile));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		List<String> lines = new ArrayList<>();
		String line = null;
		try {
			while ((line = reader.readLine()) != null) {
				lines.add(line);
				i = i +1;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Random r = new Random();

		int choice = 1 + r.nextInt(i);

		return(lines.get(choice));

	}

	public static void main(String[] args) {
		System.out.println(loadJoke());
	}
	
	
	
	
}
