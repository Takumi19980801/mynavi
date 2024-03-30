package com.example.mynavi.control;

public class StatSwitch {

	public static void main(String[] args) {
		int val = 3;
		switch (val) {
		  case 1:
		    System.out.println("変数valは1です");
		    break;
		  case 2:
		    System.out.println("変数valは2です");
		    break;
		  case 3:
		    System.out.println("変数valは3です");
		    break;
		  default:
		    System.out.println("変数valは1、2、3いずれでもありません");
		    break;
		    
		}  // 結果：変数valは3です

	}

}
