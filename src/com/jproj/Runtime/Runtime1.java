package com.jproj.Runtime;

public class Runtime1 {
	public static void main(String args[]) throws Exception {
		// Runtime.getRuntime().exec("notepad");//will open a new notepad
		System.out.println(Runtime.getRuntime().availableProcessors());

		Runtime r = Runtime.getRuntime();
		System.out.println("Total Memory: " + r.totalMemory());
		System.out.println("Free Memory: " + r.freeMemory());

		for (int i = 0; i < 10000; i++) {
			new Runtime1();
		}
		System.out.println("After creating 10000 instance, Free Memory: " + r.freeMemory());
		System.gc();
		System.out.println("After gc(), Free Memory: " + r.freeMemory());
	}
}