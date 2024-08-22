package mynavi;

public class Sample1_7 {

	public static void main(String[] args) {
		int num = 2;
		//switch文のdefaultとcaseの位置関係は決まっていない
		//switch文はbreakしない限り上から下へ実行される
		switch(num) {
		default:	System.out.println("A");
		case 1:		System.out.println("B");
					break;
		case 10:	System.out.println("C");
					break;
		}
	}

}
