package mynavi1;

public class Sample1_77_C {

	public static void main(String[] args) {
		Sample1_77_B sub = new Sample1_77_B();
		Sample1_77_A sample = new Sample1_77_B();
		/*スーパークラスからサブクラスへ型変換する場合は、
		明示的にキャストする必要がある*/
		sub = (Sample1_77_B)sample;
		sub.test();
		sample.test();
	}

}
