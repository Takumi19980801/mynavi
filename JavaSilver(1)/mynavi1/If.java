package mynavi1;

public class If {
	
//条件分岐（if・else if・else）

	public static void main(String[] args) {
		int score = 50;
		
		//比較演算子で変数の値を判断
		if (score >= 80) {
			System.out.println("合格です");
		}
		//もう一つの条件
		else if (score >= 60) {
			System.out.println("補欠合格です");
		}
		//上記以外の場合
		else {
			System.out.println("不合格です");
		}
		System.out.println("処理を終了します");
	}

}
