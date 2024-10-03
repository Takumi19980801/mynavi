package mynavi;

public interface Java_Gold_1_9 {
	int number = 100;
	/*staticメソッドは具象メソッドは定義可能だが、
	抽象メソッドは定義できない。*/
	public static String method1() {return "sa";};
	//public static String method2();
	/*インスタンスメソッドは抽象メソッドは定義可能だが、
	具象メソッドはdefaultを使わないと定義できない*/
	public String method3();
	public default String method4() {return "ss";};
}
