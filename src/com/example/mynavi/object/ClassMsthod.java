package com.example.mynavi.object;

public class ClassMsthod {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.name = "トクジロウ";
		a.color = "ネズミ";
		System.out.println(a.getInfo("%sは%s色のハムスターです。"));
	} // 結果：トクジロウはネズミ色のハムスターです。

}
