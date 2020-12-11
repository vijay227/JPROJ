package com.jproj.exception;

import java.io.IOException;
import java.sql.SQLException;

class Testthrows1  {
	int a=10,b=0,c;
	void m() throws Exception{
			c=a/b;	
	}

	void n() throws Exception {
		m();
	}

	void p() {
		try {
			n();
			System.out.println("Hiii");
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String args[]) {
		Testthrows1 obj = new Testthrows1();
		obj.p();
		System.out.println("normal flow...");
	}
}