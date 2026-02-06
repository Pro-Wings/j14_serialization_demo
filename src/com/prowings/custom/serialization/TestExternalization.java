package com.prowings.custom.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestExternalization {
	
	public static void main(String[] args) {
		
		User2 user = new User2(10, "Ram", "AB1234EF56789", "P@ssword");
		
		System.out.println("------ Serialize it ---------");

		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.ser")))
		{
			//step2 - serialize the object and write into a file
			oos.writeObject(user);
			System.out.println("User object serialized successfully!!!");
		} 
		catch (IOException e) 
		{
			System.out.println("IOEx occurred while serializing User object!!");
			e.printStackTrace();
		} 
		
		System.out.println("------ Deserialize it ---------");
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Shree\\java14\\j14_serialization_demo\\user.ser")))
		{
			User2 deserializedUser = (User2)ois.readObject();
			
			System.out.println("Deserialized User object from file : "+deserializedUser);

		} catch (FileNotFoundException e) {
			System.out.println("File not found while deserializing User object!!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOEx occurred while deserializing User object!!");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("User class not found while deserializing User object!!");
			e.printStackTrace();
		}
	}

}
