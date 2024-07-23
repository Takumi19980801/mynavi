package mynavi1;

public class Java1_22_C extends Java1_22_B {
	public double getValue() {
		System.out.println(super.num);
		return super.getValue();
	}

	public static void main(String[] args) {
		Java1_22_A a = new Java1_22_A();
		System.out.println(a.getValue());
	}

}
