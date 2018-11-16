package codebase;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ragequit {
	public static String RageQuit() {

		String csvFile = "ragequit.csv";

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
		System.out.println(RageQuit());
	}
	
}
