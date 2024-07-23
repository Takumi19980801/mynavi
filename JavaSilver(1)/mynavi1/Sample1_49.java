package mynavi1;

public class Sample1_49 {
	int a;
	int b;
	int c;
	int d;
	void setA(int a) {
		a = a;
	}
	void setB() {
		this.b = b;
	}
	int setC() {
		return c;
	}
	int setD(int num) {
		d = num;
		return d;
	}
	void setAll(int x) {
		a = b = this.c = setD(x);
	}
	public String toString() {
		return "Sample [a=" + a + ",b=" + b + ",c=" + c +",d=" + d + "]";
	}

	public static void main(String[] args) {
		Sample1_49 s = new Sample1_49();
		s.setAll(10);
		System.out.println(s);
	}

}
