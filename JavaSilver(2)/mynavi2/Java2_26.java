package mynavi2;
//クラス変数・クラスメソッドはインスタンスを生成しなくてもよい
//インスタンス変数・インスタンスメソッドはインスタンス化する必要がある

public class Java2_26 {
	//クラス変数にする必要がある
	static int num;
	private static void test() {
		num++;
		System.out.println(num);
	}

	public static void main(String[] args) {
		Java2_26.test();
		Java2_26.test();
	}

}
