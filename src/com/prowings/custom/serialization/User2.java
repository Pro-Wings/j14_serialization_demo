package com.prowings.custom.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class User2 implements Externalizable{
	
	private int id;
	private String name;
	private String accountNumber;
	private transient String password;

	//In case of Externalizable, a public no-arg/default constructor is mandatory - otherwise JVM will throw - InvalidClassException
	public User2() {
	}
	
	public User2(int id, String name, String accountNumber, String password) {
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

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {

		System.out.println("inside custom/manual write object method");
		String encryptedPwd = "AA12"+password;
		
		out.writeInt(id);
		out.writeObject(name);
		out.writeObject(accountNumber);
		out.writeObject(encryptedPwd);

		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

		System.out.println("inside custom/manual read object method");
		
		id = in.readInt();
		name = (String) in.readObject();
		accountNumber = (String) in.readObject();
		String decryptedPwd = (String) in.readObject();
		
		password = decryptedPwd.substring(4);

		
	}
	
	
}
