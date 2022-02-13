package com.oca.chapter4.pond.goose;

import com.oca.chapter4.pond.shore.Bird;

public class Gosling extends Bird { // extends means create subclass
	public void swim() {
		floatInWater(); // calling protected member
		System.out.println(text); // calling protected member
	}
}
