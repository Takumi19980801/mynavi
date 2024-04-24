package com.example.mynavi.modifier;

public class ModStatic {
	  static String hoge = "静的フィールド";
	  static void foobar() {
		  System.out.println("静的メソッド");
	  }
	  
  public static void main(String[] args) {
    System.out.println(ModStatic.hoge); // 結果：静的フィールド
	ModStatic.foobar(); // 結果：静的メソッド
  }
}
