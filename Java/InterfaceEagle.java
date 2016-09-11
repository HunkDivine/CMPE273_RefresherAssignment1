package com.salmaan.twoseventythree;

public class InterfaceEagle implements Interface {

	@Override
	public int eat() {
		System.out.println("Eagle is a carnivore, eats reptiles, fish, birds, insects and many other things");
		return 1;
	}

	@Override
	public int move() {
		System.out.println("Eagle can move on 2 legs, but would prefer flying.");
		return 1;
	}

	@Override
	public int fly() {
		System.out.println("Eagle is a pro at flying, its preferable mode of transport");
		return 1;
	}

	@Override
	public int swim() {
		System.out.println("Eagle can swim with ease, although its common to think they might not be able to");
		return 1;
	}

}
