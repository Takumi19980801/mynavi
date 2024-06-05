package mynavi2;

//入力されたデータを扱う

public class Args {

	public static void main(String[] args) {
		String message;
		message = "さん、こんにちは。";
		message = args[0] + message;
		System.out.println(message);
	}

}
