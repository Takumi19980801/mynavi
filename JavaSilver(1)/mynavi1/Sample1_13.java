package mynavi1;

public class Sample1_13 {
	static String str;

	public static void main(String[] args) {
		//デフォルト値のnullが代入されてしまい、例外処理になる
		//メソッドの引数にnullは入れられない
		switch(str) {
		case "10" : str += "10";
		default : str += "def";
		case "20" : str += "20";
		}
		System.out.println(str);
	}

}
