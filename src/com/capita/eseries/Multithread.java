package com.capita.eseries;

import com.capita.skncoe.ClassA;

// 
class MultiThreading extends ClassA implements Runnable{
	public void run(){
		try{
			System.out.println("thread id "+ Thread.currentThread().getId()+" is Running");
		}catch(Exception e){
			System.out.println("Exception is caught");
		}

	}
	
	@Override
	public void hello(){
		System.out.println("hii...");
	}
	
}
public class Multithread {

	public static void main(String[] args) {
		int n = 10;
		for(int j=0;j<n;j++){
//			MultiThreading obj = new MultiThreading();
//			obj.start();
			Thread object = new Thread(new MultiThreading()); 
            object.start();
			
		}
	}

}
