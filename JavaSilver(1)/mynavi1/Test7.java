package mynavi1;

public class Test7 {

	public static void main(String[] args) {
		int data = 1;
		//breakを記述しないと処理が実行され続けてしまう
		switch (data) {
			case 0:		System.out.println("A");
						break;
			case 1: 	System.out.println("B");
						break;
			default:	System.out.println("C");
						break;
		}
	}

}
