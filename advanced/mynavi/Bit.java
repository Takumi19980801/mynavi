package mynavi;

public class Bit {

	public static void main(String... args) {
		var v = 'y';
		int i = 0;
		switch(v) {
			case 'x': i++; break;
			case 'y' | 'z': ++i;
			case 'y': ++i;
			case 'a': i++; break;
			case 'b': ++i; break;
			default: --i;
		}
		System.out.println(i);
	}

}
