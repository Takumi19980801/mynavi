package mynavi2;

public class Java2_29 {
	//finalで修飾されたフィールドは初期化しないといけない(コンパイルエラーになる)
	private int num;
	public Java2_29(String str) {
		this.num = Integer.parseInt(str);
	}
	public Java2_29(int num) {
		this.num = num;
	}
	public Java2_29() {}
	

	public static void main(String[] args) {
		Java2_29 num = new Java2_29();
		System.out.println(num.num);
	}

}
