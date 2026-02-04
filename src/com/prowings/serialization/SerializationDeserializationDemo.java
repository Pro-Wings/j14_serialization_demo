package com.prowings.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDeserializationDemo {
	
	public static void main(String[] args) {
		
		//step1 - create object
		Student serializedObj = new Student(10, "Ram", "Pune");

		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		try 
		{
			oos = new ObjectOutputStream(new FileOutputStream("student.ser"));
			//step2 - serialize the object and write into a file
			oos.writeObject(serializedObj);
			System.out.println("Student object serialized successfully!!!");
			
			//step3 - desrialize it
			ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Shree\\java14\\j14_serialization_demo\\student.ser"));
			
			Student deserializedObj = (Student)ois.readObject();
			
			System.out.println("Deserialized Student object from file : "+deserializedObj);
			
			System.out.println("Reference equality : "+(serializedObj == deserializedObj));
			System.out.println("Object equality : "+(serializedObj.equals(deserializedObj)));
			
			
			
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
		} catch (ClassNotFoundException e) {
			System.out.println("class not found");
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
