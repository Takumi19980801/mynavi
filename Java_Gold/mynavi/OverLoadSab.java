package mynavi;

public class OverLoadSab {
	//引数1つのbuy()メソッド
	public void buy(int price) {
		System.out.println("商品1個は:" + price + "円です。");
	}
	
	//引数2つのbuy()メソッド
	public void buy(int price, int quantity) {
		System.out.println("商品" + quantity + "個の合計は:"
				+ price * quantity + "円です。");
	}
}
