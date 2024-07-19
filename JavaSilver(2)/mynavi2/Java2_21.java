package mynavi2;

public class Java2_21 {
	//インスタンス変数num:6
	private int num;
	private int test() {
		for (int i = 0; i < 3; i++) {
			num += i;
		}
		//return文によって戻り値3がmainメソッドに戻る
		return num;
	}
	public static void main(String[] args) {
		Java2_21 s = new Java2_21();
		//ローカル変数num:3
		int num = s.test();
		s.test();
		System.out.println(num);
	}

}
