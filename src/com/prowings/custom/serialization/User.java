package com.prowings.custom.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class User implements Serializable{
	
	private int id;
	private String name;
	private String accountNumber;
	private transient String password;
	
	public User() {
	}
	
	public User(int id, String name, String accountNumber, String password) {
		super();
		this.id = id;
		this.name = name;
		this.accountNumber = accountNumber;
		this.password = password;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", accountNumber=" + accountNumber + ", password=" + password
				+ "]";
	}
	
	
	private void writeObject(ObjectOutputStream oos) throws IOException 
	{
		System.out.println("inside custom/manual write object method");
		oos.defaultWriteObject();
		String encryptedPwd = "AA12"+password;
		
//		oos.writeInt(id);
//		oos.writeObject(name);
//		oos.writeObject(accountNumber);
		oos.writeObject(encryptedPwd);
		
	}

	
	private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException
	{
		System.out.println("inside custom/manual read object method");
		
		ois.defaultReadObject();
//		id = ois.readInt();
//		name = (String) ois.readObject();
//		accountNumber = (String) ois.readObject();
		String decryptedPwd = (String) ois.readObject();
		password = decryptedPwd.substring(4);
	}
}
