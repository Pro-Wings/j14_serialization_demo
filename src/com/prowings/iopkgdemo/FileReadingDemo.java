package com.prowings.iopkgdemo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingDemo {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("abc.txt");
		
		System.out.println(file.exists());
		System.out.println(file.canRead());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		
		FileReader fileReader = new FileReader(file);
		
		int ch;
		while ((ch = fileReader.read()) != -1) {
		    System.out.print((char) ch);
		}
		fileReader.close();		
	}

}
