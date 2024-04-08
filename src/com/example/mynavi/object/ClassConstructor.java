package com.example.mynavi.object;

public class ClassConstructor {

	public static void main(String[] args) {
		Animal a = new Animal("トクジロウ","ネズミ");
		System.out.println(a.getInfo("%sは%s色のハムスターです"));
	} // 結果：トクジロウはネズミ色のハムスターです。

}
