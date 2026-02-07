package com.prowings.iopkgdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class DynamicFileReadingDemo {
	
	public static void main(String[] args) throws IOException {

		DynamicFileReadingDemo obj = new DynamicFileReadingDemo();
		
		InputStream is = obj.getClass().getClassLoader().getResourceAsStream("pqr.txt");

		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		
		br.lines().forEach(System.out::println);
		
		br.close();
		
	}

}
