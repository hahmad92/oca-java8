package com.oca.chapter4.pond.goose;

public class GooseWatcher {
	public void watch() {
		Goose goose = new Goose();
		goose.floatInWater(); // DOES NOT COMPILE
	}
}
