package mynavi;

class Base	{
	public void display() {
		System.out.println("Base");
	}
}

class Middle extends Base	{
	public void display() {
		System.out.println("Middle");
	}
}

class Sub extends Middle	{
	public void display() {
		System.out.println("Sub");
	}
}

public class Override {

	public static void main(String[] args) {
		Base base = new Base();
		Base middle = new Middle();
		Base sub = new Sub();
		base.display();
		middle.display();
		sub.display();
	}

}
