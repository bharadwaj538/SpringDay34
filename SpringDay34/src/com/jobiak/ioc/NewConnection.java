package com.jobiak.ioc;

public class NewConnection {
	public NewConnection getConnection() {
	System.out.println("Providing new connection...");
	return new NewConnection();
	}
}
