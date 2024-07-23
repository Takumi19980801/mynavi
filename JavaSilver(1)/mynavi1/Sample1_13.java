package mynavi1;

public class Sample1_13 {
	static String str = "30";

	public static void main(String[] args) {
		switch(str) {
		case "10" : str += "10";
		default : str += "def";
		case "20" : str += "20";
		}
		System.out.println(str);
	}

}
