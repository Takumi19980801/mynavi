package mynavi1;

public class Sample2_29 {
	private final int num;
	public Sample2_29(String str) {
		this(Integer.parseInt(str));
	}
	public Sample2_29(int num) {
		this.num = num;
	}
	//引数無しのコンストラクタにアクセスすると、numが初期化されない
	//public Sample2_29() {}
	public int getNum() {
		return this.num;
	}
	

}
