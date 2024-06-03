package mynavi2;

//配列と繰り返し分の組み合わせ

public class Array3 {

	public static void main(String[] args) {
		int[] no = {1, 5, 2};
		int len = no.length;
		for (int i = 0; i < len; i++) {
			System.out.println((i + 1) + "番目のお客様、" + no[i] + "番窓口へ");
		}
		System.out.println("現在のお客様は" + len + "人です");
	}

}
