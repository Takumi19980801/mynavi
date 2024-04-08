package com.example.mynavi.object;

class Animal {
	String name;
	String color;
	
	public Animal() {
	}
	
	public Animal(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public String getInfo() {
		return this.getInfo("%sは%s色のハムスターです。");
	}
	
	public String getInfo(String format) {
		return String.format(format, this.name, this.color);
	}
}