package com.example.mynavi.object;

public class AnonymousSample {

	public static void main(String[] args) {
		IPrintable p = new IPrintable() {
			@Override
			public void print() {
				System.out.println("TEST");
			}
		};
		p.print(); // 結果：TEST
	}
}
