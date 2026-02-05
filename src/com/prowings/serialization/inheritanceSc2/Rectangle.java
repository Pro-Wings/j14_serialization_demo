package com.prowings.serialization.inheritanceSc2;

import java.io.Serializable;

public class Rectangle extends Shape implements Serializable{
	
	long p;
	long q;
	

	public Rectangle() 
	{
//		super(1,1);
		System.out.println("inside no-arg construcor of Rectangle!!");
	}

	public Rectangle(long p, long q) {
//		super(1,1);
		System.out.println("inside all-arg construcor of Rectangle!!");
		this.p = p;
		this.q = q;
	}

	@Override
	public String toString() {
		return "Rectangle [p=" + p + ", q=" + q + "]";
	}


}
