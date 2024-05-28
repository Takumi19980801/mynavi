package mynavi1;

//switch文（一つの変数の値によってのみ条件を分けたい場合）

public class Switch {

	public static void main(String[] args) {
		char moji = 'a';
		switch (moji) {
			case 'a':	//aの場合
				System.out.println("aです");
				break;
			case 'b':	//bの場合
				System.out.println("bです");
				break;
			case 'c':	//cの場合
				System.out.println("cです");
				break;
			default:	//それ以外の場合
				System.out.println("a,b,c以外です");
				break;
		}
	}

}
