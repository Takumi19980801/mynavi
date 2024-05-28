package mynavi1;

public class Implict {

	public static void main(String[] args) {
		int iValue = 10;
		double dValue;
		
		//double型の変数に対してint型のデータを代入
		dValue = iValue;		//拡大変換は暗黙的型変換が可能
		
		System.out.println("拡大変換：int型の" + iValue + "から、double型の " + dValue);
		
		//int型＊double型の計算結果はdouble型
		double ans = 10 * 2.5;
		
		System.out.println("計算結果は：" + ans + "です。");
	}

}
