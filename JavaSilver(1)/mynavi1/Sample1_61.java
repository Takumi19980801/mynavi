package mynavi1;

public class Sample1_61 {

	public static void main(String[] args) {
		String s1 = new String("Java");
		String s2 = "Java";
		String s3 = s1.intern();
		String s4 = s2.intern();
		System.out.println(s1 == s3);
		System.out.println(s2 == s3);
		System.out.println(s1 == s4);
		System.out.println(s2 == s4);
	}

}
