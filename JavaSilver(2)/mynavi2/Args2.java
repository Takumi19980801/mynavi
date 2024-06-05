package mynavi2;

//argsをString型からint型に変換する

public class Args2 {

	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);
		if (score >= 80) {
			System.out.println("合格です");
		} else {
			System.out.println("不合格です");
		}
	}

}
