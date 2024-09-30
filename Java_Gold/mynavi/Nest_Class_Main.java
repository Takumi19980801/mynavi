package mynavi;

public class Nest_Class_Main {

	public static void main(String[] args) {
		Nest_Class1.A a = new Nest_Class1().new A();	//非staticクラスのインスタンス化
		Nest_Class1.B b = new Nest_Class1.B();			//staticクラスのインスタンス化
		a.method1();b.method2();
	}

}
