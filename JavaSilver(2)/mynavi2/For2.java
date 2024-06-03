package mynavi2;

//if文やfor文はブロックを省略可能

public class For2 {

	public static void main(String[] args) {
		int num = 50;
		if (num % 2 == 1)
			System.out.println("numは奇数です");
		else
			System.out.println("numは偶数です");
		
		System.out.println();
		
		for (int i = 1; i <= 3; i++) System.out.print(i);
		System.out.println("繰り返し処理終了");
	}

}
