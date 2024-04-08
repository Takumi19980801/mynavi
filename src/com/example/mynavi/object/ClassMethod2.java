package com.example.mynavi.object;

public class ClassMethod2 {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.name = "トクジロウ";
		a.color = "ネズミ";
		System.out.println(a.getInfo());
	} // 結果：トクジロウはネズミ色のハムスターです。

}
