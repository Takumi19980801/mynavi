package mynavi1;

public class Sample_Constructor_B extends Sample_Constructor_A {
	public Sample_Constructor_B() {
		System.out.println("Sub");
	}
	public Sample_Constructor_B(String str) {
		this();
		System.out.println("Sample");
	}

	public static void main(String[] args) {
		Sample_Constructor_A str = new Sample_Constructor_B("str");
	}

}
