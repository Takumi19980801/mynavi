package mynavi1;

public class Boolean2 {

	public static void main(String[] args) {
		int num = 10;
		
		//if文のブロックに処理は移行しない
		if (false & ++num == 11) {
			//何らかの処理
		}
		System.out.println("num = " + num);
	}

}
