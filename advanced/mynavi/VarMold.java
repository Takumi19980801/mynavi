package mynavi;

public class VarMold {
	//インスタンス変数(フィールド)にvarを使用することはできない
	private int var;
	private	VarMold(int tVar) {
		var var = tVar++;
		this.var = ++var;
		var -= 1;
		System.out.println(var + " ");
	}
	public int getValue() {
		return var;
	}

	public static void main(String... args) {
		var var = 'a';
		VarMold v = new VarMold(var);
		System.out.println(v.getValue() + " ");
	}

}
