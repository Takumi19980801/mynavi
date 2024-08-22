package mynavi;

public class Sample1_12 {

	public static void main(String[] args) {
		//String型は不変
		String str = "abcd ef gh";
		//indexOf():文字のインデックス番号を取得
		int x = str.indexOf("ef");
		//substring():インデックス番号以降の文字列を取得
		str.substring(x + 3);
		x = str.indexOf("ef");
		System.out.println(str + " " + x);
	}

}
