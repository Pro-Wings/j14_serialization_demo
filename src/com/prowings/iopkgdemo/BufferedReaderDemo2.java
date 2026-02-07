package com.prowings.iopkgdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class BufferedReaderDemo2 {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("abc.txt");
		FileReader reader = new FileReader(file);
		BufferedReader br = new BufferedReader(reader);

		String line;
		
		long lineCount = 0;
		long wordCount = 0;
		long charCount = 0;

		lineCount = br.lines().count();
		System.out.println("Total number of Lines : "+lineCount);
		br.close();
		
		File file2 = new File("abc.txt");
		FileReader reader2 = new FileReader(file2);
		BufferedReader br2 = new BufferedReader(reader2);
		wordCount = br2.lines()
				.flatMap(ln -> Arrays.stream(ln.split(" ")))
				.count();
		System.out.println("Total number of Words : "+wordCount);
		br2.close();
		
		File file3 = new File("abc.txt");
		FileReader reader3 = new FileReader(file3);
		BufferedReader br3 = new BufferedReader(reader3);
		wordCount = br3.lines()
				.flatMap(ln -> Arrays.stream(ln.split(" ")))
				.flatMap(w -> Arrays.stream(w.split("")))
				.count();
		System.out.println("Total number of Words : "+wordCount);
		br2.close();
		
		
		
		
		
	}

}
