package com.looseCoupling;

public class LooseCouplingEg3 {

	public static void main(String[] args) {
		
//		Library3 libr = new Library3(new Mgz3());
		Library3 libr = new Library3(new Book3());
		libr.learn();
		
		
	}

}
