package com.example.mynavi.object;

public class Util {

	public static double sum(double... values) {
		double result = 0;
	    for (double value : values) {
	      result += value;
	    }
	    return result;
	}

}
