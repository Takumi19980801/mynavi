package mynavi1;

public class Sample1_74 {

	public static void main(String[] args) {
		StringBuilder[] str = new StringBuilder[] {};
		int i = 0;
		for (StringBuilder s : str) {
			str[i].append("e" + i);
			i++;
		}
		for (i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}

}
