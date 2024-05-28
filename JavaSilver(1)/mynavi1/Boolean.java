package mynavi1;

public class Boolean {

	public static void main(String[] args) {
		int num = 10;
		
		//if文のブロックに処理を移行しない
		if (false && ++num  == 10) {
			//何らかの処理
		}
		
		System.out.println("num = " + num);
	}

}
