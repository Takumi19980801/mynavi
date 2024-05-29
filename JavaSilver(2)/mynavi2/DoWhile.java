package mynavi2;

//While文と比べて、最低一回は繰り返す構造

public class DoWhile {

	public static void main(String[] args) {
		int i = 1;
		do {
			System.out.println(i + "回繰り返し");
			i++;
		} while (i <= 5);
	}

}
