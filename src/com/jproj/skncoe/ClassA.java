package com.jproj.skncoe;

public abstract class ClassA {
	  public abstract void hello();
}
/*
class A { 
    static void fun() 
    { 
        System.out.println("A.fun()"); 
    } 
    
    void print(){
    	System.out.println("Hii");
    }
} 
  
// B is inheriting A 
// Base class 
class B extends A { 
    static void fun() 
    { 
        System.out.println("B.fun()"); 
    } 
    
    void print(){
    	System.out.println("bye");
    }
} 

class ClassA {
	public static void main(String args[]) 
    { 
		B b = new B(); 
		b.fun();;
		
        A a = new B(); 
        a.fun(); 
        a.print();
        // prints A.fun(); 
  
        // B a = new B(); 
        // a.fun(); // prints B.fun() 
  
        // the variable type decides the method 
        // being invoked, not the assigned object type 
    } 
}*/