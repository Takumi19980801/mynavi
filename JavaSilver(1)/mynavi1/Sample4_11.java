package mynavi1;

public class Sample4_11 {

	public static void main(String[] args) {
		String[][] array = { {"A","B","C"} };
		for ( Object[] innerarray : array) {
			for ( Object obj : innerarray) {
				System.out.println(obj);
			}
		}
	}

}
