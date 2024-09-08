package mynavi;

public class Final_Main {

	public static void main(String[] args) {
		final Final_Foo obj1 = new Final_Foo(100);
		//obj1.num1 = 20;
		//obj1 = new Final_Foo(100);
		Final_Foo obj2 = new Final_Foo(300);
		System.out.println("obj1.num1：" + obj1.num1);
		System.out.println("obj2.num2：" + obj2.num2);
	}

}
