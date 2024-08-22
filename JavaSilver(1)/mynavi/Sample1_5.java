package mynavi;

public class Sample1_5 {
	static int num = 23;

	public static void main(String[] args) {
		//this.numはstaticコンテキストでは使えない
		int num = Sample1_5.num;
		System.out.println(num);
	}

}
