package mynavi2;

public class Java2_49 {
	int a,b;
	public Java2_49(int a, int b) {
		init(a,b);
	}
	public void init(int a, int b) {
		this.a = a * a;
		this.b = b * b;
	}

	public static void main(String[] args) {
		int a = 2, b = 3;
		Java2_49 s = new Java2_49(a,b);
		//同名の場合ローカル変数が優先される
		System.out.println(a + "、" + b);
	}

}
