package com.example.mynavi.object;

public class Animal {
	String name = "ポチ";
	String color = "White";
	
	public String getInfo() {
		return this.getInfo("%sは%s色のハムスターです。");
	}
	
	public String getInfo(String format) {
		return String.format(format, this.name, this.color);
	}
}