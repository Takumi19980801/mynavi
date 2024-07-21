package mynavi2;

import java.util.function.Consumer;

public class Java2_36 {

	public static void main(String[] args) {
		final String val = "Hello, Lambda";
		//Consumerインターフェースは引数を受け取り、結果を返さない
		Consumer<String> func = (v) -> System.out.println(val);
		func.accept("Hello, Java");
	}

}
