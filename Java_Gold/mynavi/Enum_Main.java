package mynavi;

public class Enum_Main {

	public static void main(String[] args) {
		Enum_sab.Card card = Enum_sab.Card.SPADES;
		System.out.println(card);
		System.out.println(card.getA());
		//ordinalメソッド：列挙宣言での位置を返す
		System.out.println(card.ordinal());
		System.out.println(card.HEARTS.getA());
		for(Enum_sab.Card obj : Enum_sab.Card.values()) {
			System.out.print(obj + " ");
		}
	}

}
