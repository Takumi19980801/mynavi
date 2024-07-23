package mynavi1;

public class Sample1_35_B extends Sample1_35_A{
	private void print() {
		System.out.println("B");
	}
	public void b() {
		print();
	}

	public static void main(String[] args) {
		Sample1_35_B b = new Sample1_35_B();
		b.a();
		b.b();
	}

}
