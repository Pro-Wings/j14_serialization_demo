package com.prowings.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDeserializationForNestedObjectsDemo {
	
	public static void main(String[] args) {
		
		//step1 - create object
		Address addr = new Address(1234, "Mumbai", "India");
		Employee emp1 = new Employee(10, "Ram", addr);

		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		try 
		{
			oos = new ObjectOutputStream(new FileOutputStream("emp.ser"));
			//step2 - serialize the object and write into a file
			oos.writeObject(emp1);
			System.out.println("Employee object serialized successfully!!!");
			
			//step3 - desrialize it
			ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Shree\\java14\\j14_serialization_demo\\emp.ser"));
			
			Employee deserializedEmp = (Employee)ois.readObject();
			
			System.out.println("Deserialized Employee object from file : "+deserializedEmp);
			
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
