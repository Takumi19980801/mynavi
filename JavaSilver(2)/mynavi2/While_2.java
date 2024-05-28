package mynavi2;

//合計を出力

public class While_2 {

	public static void main(String[] args) {
		
		int max = 10;		//最大値用の変数を宣言
		int num = 1;		//カウント用の変数を宣言
		int sum = 0;		//合計用の変数を宣言
		
		while (num <= max) {
			sum = sum + num;
			num = num + 1;
		}
		System.out.println("1～" + max + "までの合計は" + sum + "です");
	}

}
