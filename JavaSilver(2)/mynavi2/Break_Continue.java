package mynavi2;

//break（for文を強制的に抜ける)
//continue（直前のfor文の処理に強制的に戻る)

public class Break_Continue {

	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			if (i ==1) {
				System.out.println("continue");
				continue;
			} else if (i == 3) {
				System.out.println("break");
				break;
			}
			System.out.println("i = " + i);
		}
	}

}
