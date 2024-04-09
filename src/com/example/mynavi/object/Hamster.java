package com.example.mynavi.object;

class Hamster extends Animal {
	public Hamster(String name, String color) {
		super(name, color);
	}
	
	public void gnaw() {
		System.out.println("ガジガジ…");
	}
}
