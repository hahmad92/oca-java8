package com.oca.chapter4.pond.swan;

import com.oca.chapter4.pond.goose.Gosling;
import com.oca.chapter4.pond.shore.Bird;

public class Swan extends Bird { // but subclass of bird
	public void swim() {
		floatInWater(); // package access to superclass
		System.out.println(text); // package access to superclass
	}

	public void helpOtherSwanSwim() {
		Swan other = new Swan();
		other.floatInWater(); // package access to superclass
		System.out.println(other.text);// package access to superclass
	}

	public void helpOtherBirdSwim() {
		Bird other = new Bird();
		other.floatInWater(); // DOES NOT COMPILE
		System.out.println(other.text); // DOES NOT COMPILE
	}

	public void printGosling(){
		Gosling gosling = new Gosling();
		gosling.floatInWater(); // DOES NOT COMPILE
		System.out.println(gosling.text); // DOES NOT COMPILE
	}
}
