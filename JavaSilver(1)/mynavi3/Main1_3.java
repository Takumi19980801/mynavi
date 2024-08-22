package mynavi3;

import mynavi.Sample1_3;
import mynavi2.Test1_3;

public class Main1_3 {

	public static void main(String[] args) {
		new Sample1_3().sample();
		int num = Integer.parseInt(args[0]);
		new Test1_3().test(num);
	}

}
