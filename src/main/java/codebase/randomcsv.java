package codebase;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class randomcsv {
	
	
	public static String RandomCSV(String csvFile) {

		List<Object> lines = null;
		try {
			lines = Files.lines(Paths.get(csvFile)).collect(Collectors.toList());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 Random r = new Random();
		 int choice = 0 + r.nextInt(lines.size());
		 return (String) (lines.get(choice));
	
	}

	public static void main(String[] args) {
		System.out.println(RandomCSV("cintara.csv"));
	}
	
	
}
