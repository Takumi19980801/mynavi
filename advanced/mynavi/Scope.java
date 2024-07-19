package mynavi;

public class Scope {
	private int value;
	private Scope(int tValue) {
		int value = tValue * 2;
		this.value = value * 3;
		value *= 4;
		System.out.println(value + " ");
	}
	public int getValue() {
		//this.valueでも可能
		return value;
	}
	public static void main(String... args) {
		int value = 2;
		Scope s = new Scope(value);
		System.out.print(s.getValue() + " ");
	}
}
