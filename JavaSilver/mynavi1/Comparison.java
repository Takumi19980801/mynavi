package mynavi1;

//比較演算子

public class Comparison {

	public static void main(String[] args) {
		int value1,value2;
		boolean bool;		//boolean型の変数を定義する
		
		value1 = 5;
		value2 = 5;
		
		//value1とvalue2の値が等しいかどうかを変数boolに代入
		bool = value1 == value2;
		System.out.println("value1 == value2:" + bool);
		
		value1 = 10;
		
		//value1とvalue2の値が等しいかどうかを変数boolに代入
		bool = value1 == value2;
		System.out.println("value1 == value2:" + bool);
		
		//value1がvalue2より大きいかどうかを変数boolに代入
		bool = value1 > value2;
		System.out.println("value1 > value2:" + bool);
	}

}
