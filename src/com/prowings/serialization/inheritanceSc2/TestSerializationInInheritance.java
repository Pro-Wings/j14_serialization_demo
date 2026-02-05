package com.prowings.serialization.inheritanceSc2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerializationInInheritance {
	
	public static void main(String[] args) {
		
		//Rule2: If parent is not-serializable, child is serializable, then at the time of deserialization, JVM executes Instance Control Flow - where it tries to call no-arg constructor of non-serializable parent.		
		Rectangle rectangle = new Rectangle(10L, 20L);
		
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		try 
		{
			oos = new ObjectOutputStream(new FileOutputStream("rectangle.ser"));
			//step2 - serialize the object and write into a file
			oos.writeObject(rectangle);
			System.out.println("rectangle object serialized successfully!!!");
			
			//step3 - desrialize it
			ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Shree\\java14\\j14_serialization_demo\\rectangle.ser"));
			
			Rectangle deserializedrectangle = (Rectangle)ois.readObject();
			
			System.out.println("Deserialized Rectangle object from file : "+deserializedrectangle);
			
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
