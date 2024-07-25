package mynavi1;

public class Sample1_71 {

	public static void main(String[] args) {
		String[][] array = new String[2][2];
		array[0][0] = "a";
		array[0][1] = "b";
		array[1][0] = "c";
		array[1][1] = "d";
		/*for (String[] a : array) {
			for (String b : a) {
				System.out.println(b);
			}
		}*/
		for (int i = 0; i < 2;) {
			for (int j = 0; j < 2;) {
				System.out.println(array[i][j]);
				j++;
			}
			i++;
		}
	}

}
