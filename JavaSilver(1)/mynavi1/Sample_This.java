package mynavi1;

public class Sample_This {
	public String str = "Main";

	public void main(String str) {
		System.out.println(str);
		//インスタンス変数は二通りアクセス方法がある
		System.out.println(this.str);
		System.out.println(new Sample_This().str);
	}
	public static void main(String[] args) {
		String str = "Sub";
		new Sample_This().main(str);
		System.out.println(str);
		//クラスメソッドではthisは使えない
		//System.out.println(this.str);
		System.out.println(new Sample_This().str);
	}

}
