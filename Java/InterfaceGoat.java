package com.salmaan.twoseventythree;

public class InterfaceGoat implements Interface {

	@Override
	public int eat() {
		System.out.println("Goat is a herbivore, eats bushes, trees and plants among other things.");
		return 1;
	}

	@Override
	public int move() {
		System.out.println("Goat walks on four legs, is capable of running.");
		return 1;
	}

	@Override
	public int fly() {
		System.out.println("Goat is unable to fly, unless you throw it from an airplane");
		return 0;
	}

	@Override
	public int swim() {
		System.out.println("Goat are able to swim, but it's not in their nature to, and will do it only if it's absolutely necessary");
		return 1;
	}

}
