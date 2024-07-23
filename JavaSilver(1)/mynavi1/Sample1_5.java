package mynavi1;

public class Sample1_5 {
	int num = 23;
	public void test() {
		int num = new Sample1_5().num;
	}

	public static void main(String[] args) {
		int num = new Sample1_5().num;
		System.out.println(num);
	}

}
