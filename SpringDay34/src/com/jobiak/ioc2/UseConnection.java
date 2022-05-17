package com.jobiak.ioc2;
import com.jobiak.ioc.*;
public class UseConnection {
	public UseConnection() {
		Connection con=new Connection();
		con.getConnection();
		System.out.println("The connection obtained from "+this.getClass());
		
		NewConnection con2=new NewConnection();
		con2.getConnection();
		System.out.println("The connection obtained from "+this.getClass());
	}
}
