package com.example.mynavi.object;

public class Animal {
	String name = "ポチ";
	String color = "White";
	
	public String getInfo(String format) {
		return String.format(format, this.name, this.color);
	}
}