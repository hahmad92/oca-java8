package com.oca.chapter4.pond.inland;

import com.oca.chapter4.pond.shore.Bird;

public class BirdWatcherFromAfar {
	public void watchBird() {
		Bird bird = new Bird();
		bird.floatInWater();
		System.out.println(bird.text); // DOES NOT COMPILE
	}
}
