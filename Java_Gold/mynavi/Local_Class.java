package mynavi;

public class Local_Class {
	private static int a = 1;		//static変数
	private int b = 2;				//インスタンス変数
	void methodOuter(final int c, int d) {
		final int e = 5; int f = 6;
		class A {
			void method() {
				System.out.print(a + " ");
				System.out.print(b + " ");
				System.out.print(c + " ");
				System.out.print(d + " ");
				System.out.print(f);
				//d = 100;			//NG
				//f = 100;			//NG
			}
		}
		new A().method();
	}
}
