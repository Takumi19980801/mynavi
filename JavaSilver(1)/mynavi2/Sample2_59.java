package mynavi2;

public class Sample2_59 {

	public static void main(String[] args) {
		int x = 100;
		int y = x;
		x++;
		String str = "121";
		String st = str;
		st.concat("2");
		StringBuilder sb1 = new StringBuilder("123");
		StringBuilder sb2 = sb1;
		sb1.append("4");
		System.out.println(str + st);
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println((x == y) + " " + (str == st) + " " + (sb1 == sb2));
	}

}
