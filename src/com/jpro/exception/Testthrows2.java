package com.capita.exception;

import java.sql.SQLException;

class Testthrows2  {
	int a=10,b=0,c;
	void m() {
		try{
			c=a/b;	
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

	void n() {
		m();
	}

	void p() {
			n();
			System.out.println("Hiii");
		}

	public static void main(String args[]) {
		Testthrows2 obj = new Testthrows2();
		obj.p();
		System.out.println("normal flow...");
	}
}