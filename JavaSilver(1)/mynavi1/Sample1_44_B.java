package mynavi1;

public class Sample1_44_B extends Sample1_44_A {
	int price;
	public Sample1_44_B(int price) {
		//super();が自動的に追加
		this.price = price;
	}
	public Sample1_44_B(String name, int num, int price) {
		/*super()とthis()は併用できない
		super(name,num);
		this(price);
		*/
	}
}
