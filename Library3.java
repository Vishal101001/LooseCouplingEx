package com.looseCoupling;

public class Library3 {
	
	Calling3 c;
	
	Library3(Calling3 c){
		this.c= c;
	}
	
	public void learn() {
		System.out.println("learning in...");
		c.read();
	}
}
