package mynavi;

public class Nest_Class1 {
	private int val1 = 100;			//インスタンス変数
	private static int val2 = 200;	//static変数
	class A {						//非staticクラス(インナークラス)
		void method1() {			//非staticメソッド
			System.out.println("val1:" + val1);
			System.out.println("val2:" + val2);
		}
		//非staticクラスはstaticメンバを持てない
		/*static void method2() {	//staticメソッド
			System.out.println("val1:" + val1);
			System.out.println("val2:" + val2);
		}*/
	}
	static class B {				//staticクラス
		void method1() {			//非staticメソッド
			//インスタンス変数(val1)にアクセスできない
			//System.out.println("val1:" + val1);
			System.out.println("val2:" + val2);
		}
		static void method2() {		//staticメソッド
			//インスタンス変数(val1)にアクセスできない
			//System.out.println("val1:" + val1);
			System.out.println("val2:" + val2);
		}
	}

}
