package mynavi2;

public class Sample2_56 {
	int squares = 81;

	public static void main(String[] args) {
		new Sample2_56().go();
	}
	
	void go() {
		incr(++squares);
		System.out.println(squares);
	}
	
	void incr(int squares) {
		new Sample2_56().squares += 10;
	}

}
