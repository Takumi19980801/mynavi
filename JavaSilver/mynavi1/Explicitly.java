package mynavi1;

public class Explicitly {

	public static void main(String[] args) {
		//浮動小数リテラルから整数型へのキャスト
		byte bValue1 = (byte)20.5;		//明示的型変換
		System.out.println(bValue1);
		
		//範囲を超えたデータのキャスト
		byte bValue2 = (byte)264;		//明示的型変換
		System.out.println(bValue2);
		
		//浮動小数変数から整数型へのキャスト
		double dValue = 10.5;
		int iValue = (int) dValue;		//明示的型変換
		System.out.println(iValue);
	}

}
