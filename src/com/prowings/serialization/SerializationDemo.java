package com.prowings.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	
	public static void main(String[] args) {
		
		//step1 - create object
		Student std1 = new Student(10, "Ram", "Pune");

		ObjectOutputStream oos = null;
		try 
		{
			oos = new ObjectOutputStream(new FileOutputStream("student.ser"));
			//step2 - serialize the object and write into a file
			oos.writeObject(std1);
			System.out.println("Student object serialized successfully!!!");
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("FNFEx occurred!!");
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			System.out.println("IOEx occurred!!");
			e.printStackTrace();
		}
		finally {
			try {
				oos.close();
			}
			catch (IOException e) 
			{
				System.out.println("some error occurred while closing the OOS!!");
				e.printStackTrace();
			}
		}
		
		
	}

}
