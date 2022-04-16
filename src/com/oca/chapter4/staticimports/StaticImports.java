package com.oca.chapter4.staticimports;

import static com.oca.chapter4.staticimports.ClassA.*;
import static com.oca.chapter4.staticimports.ClassA.NAME;
import static com.oca.chapter4.staticimports.ClassA.printName;
import static com.oca.chapter4.staticimports.ClassB.*;
import static com.oca.chapter4.staticimports.ClassC.*;

public class StaticImports {

	//public final static String CITY;
	
	public StaticImports(){
		//CITY = "Lahore";
	}
	public static void main(String[] args) {

		System.out.println(NAME);
		printName();
	}
	
	public void displayData() {
		System.out.println(NAME);
		printName();
	}

}
