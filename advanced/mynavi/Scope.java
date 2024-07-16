package mynavi;

public class Scope {
	int num = 2;

	public static void main(String[] args) {
		int num = 1;
		Scope number = new Scope();
		System.out.println(num);
		System.out.println(number.num);
	}

}
