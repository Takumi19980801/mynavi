package mynavi;

public class Or {
	public static boolean methodX() {
		System.out.println("X"); return true;
	}
	public static boolean methodY() {
		System.out.println("Y"); return true;
	}

	public static void main(String... args) {
		if( !methodX() || methodY() )
			System.out.println("A");
		else
			System.out.println("B");
	}

}
