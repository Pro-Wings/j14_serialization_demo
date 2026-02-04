package com.prowings.deserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.prowings.serialization.Student;

public class DeserializationDemo {
	
	public static void main(String[] args) {
		
		try 
		{
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Shree\\java14\\j14_serialization_demo\\student.ser"));
			
			Student deserializedObj = (Student)ois.readObject();
			
			System.out.println("Deserialized Student object from file : "+deserializedObj);
		} 
		catch (FileNotFoundException e) {
			System.out.println("File not found!!!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Some error occurred during reading file!!!");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found!!!");
			e.printStackTrace();
		}
		
	}

}
