package mynavi2;

//配列の要素数を取得

public class Array2 {

	public static void main(String[] args) {
		int[] no = {1, 5, 2};
		int len = no.length;
		
		System.out.println("1番目のお客様、" + no[0] + "番目の窓口へ");
		System.out.println("2番目のお客様、" + no[1] + "番目の窓口へ");
		System.out.println("3番目のお客様、" + no[2] + "番目の窓口へ");
		System.out.println("現在のお客様は" + len + "人です");
	}

}
