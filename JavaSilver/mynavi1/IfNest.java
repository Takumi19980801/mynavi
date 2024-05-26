package mynavi1;

//if文のネスト

public class IfNest {

	public static void main(String[] args) {
		int score = 120;
		
		if (score <= 100) {
			if (score >= 80) {
				System.out.println("合格です");
			}
			else {
				System.out.println("不合格です");
			}
		}
		else {
			System.out.println("値の範囲が無効です");
		}
	}

}
