package com.prowings.serialization.inheritanceSc1;

public class Rectangle extends Shape{
	
	long p;
	long q;
	

	public Rectangle() 
	{
		System.out.println("inside no-arg construcor of Rectangle!!");
	}

	public Rectangle(long p, long q) {
		System.out.println("inside all-arg construcor of Rectangle!!");
		this.p = p;
		this.q = q;
	}

	@Override
	public String toString() {
		return "Rectangle [p=" + p + ", q=" + q + "]";
	}


}
