package mynavi;

public class Enum_sab {
	//列挙型：特定の値を持つことができる
	enum Card	{
		SPADES(3),	CLUBS(1),
		DIAMONDS(4),	HEARTS();
		private int	a;
		Card() {this.a = 100; }		//コンストラクタ
		Card(int a) {this.a = a; }	//コンストラクタ
		public int getA() {return a; }
	}
}
