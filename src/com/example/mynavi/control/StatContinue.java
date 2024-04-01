package com.example.mynavi.control;

public class StatContinue {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			if (i % 2 == 0) { continue; }
			System.out.print(i + "/");
		} // 結果：1/3/5/7/9/

	}

}
