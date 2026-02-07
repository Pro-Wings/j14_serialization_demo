package com.prowings.iopkgdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("abc.txt");
		FileReader reader = new FileReader(file);
		BufferedReader br = new BufferedReader(reader);

		String line;
		
		int lineCount = 0;
		int wordCount = 0;
		int charCount = 0;
		
		while ((line = br.readLine()) != null) {
		    lineCount++;

		    String[] words = line.split(" ");
		    wordCount += words.length;
		    
		    for(String w : words)
		    	charCount += w.length();
		    
		}
		
		System.out.println("Lines count : "+lineCount);
		System.out.println("Words count : "+wordCount);
		System.out.println("Characters count : "+charCount);
		
		br.close();
		
		
		
		
	}

}
