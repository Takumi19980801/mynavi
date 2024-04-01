package com.example.mynavi.control;

public class StatBreak {

	public static void main(String[] args) {
		int val = 0;
		while (val < 10) {
			System.out.print(val + "/");
			val++;
			if (val > 5 ) { break;}
		} // 結果：0/1/2/3/4/5/

	}

}
