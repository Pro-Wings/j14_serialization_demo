package com.prowings.serialization.inheritanceSc1;

import java.io.Serializable;

public class Shape implements Serializable{
	
	int x;
	int y;

	public Shape() {
		
		System.out.println("inside Shape() no-arg constructor!!");
	}

	public Shape(int x, int y) {
		System.out.println("inside Shape() all-arg constructor!!");
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Shape [x=" + x + ", y=" + y + "]";
	}
	
	

}
