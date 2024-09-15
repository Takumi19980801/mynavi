package mynavi;

public class Equals {

	public static void main(String[] args) {
		Tostring_Foo f1 = new Tostring_Foo(); Tostring_Foo f2 = new Tostring_Foo();
		System.out.println("f1.equals(f2)：" + f1.equals(f2));
		Tostring_Foo f3 = new Tostring_Foo(); Tostring_Foo f4 = f3;
		System.out.println("f3.equals(f4)：" + f3.equals(f4));
		System.out.println("f3.equals(null)：" + f3.equals(null));
	}

}
