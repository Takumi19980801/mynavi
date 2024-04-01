package com.example.mynavi.control;

public class StatBreak2 {

	public static void main(String[] args) {
		ext :
			for (int i = 1; i < 10; i++) {
				for (int j = 1; j < 10; j++) {
					if (i * j > 50) { break ext; }
					System.out.print((i * j) + "/");
				}
				System.out.println();
			}

	}

}
