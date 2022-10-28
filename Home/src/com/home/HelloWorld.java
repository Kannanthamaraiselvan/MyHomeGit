package com.home;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		
		int a=3;
	    a=a++;
	    System.out.println("Post-Increment a: " +a);
	 
//	    a=++a;
//	    System.out.println("Pre-Increment a: "+a );
	 
	    a=a--;
	    System.out.println("Post-Decrement a: " +a);
	 
//	    a=--a;
//	    System.out.println("Pre-Decrement a: "+a );
	  
	    
	    for (int i=1; i <= 10; ++i) {
	    	System.out.println(i);
	    }
	}

}
