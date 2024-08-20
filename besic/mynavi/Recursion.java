package mynavi;

public class Recursion {
	public static void main(String[] args) {
		int n = 5;
		add(n);
	}
	
	public static void add(int n) {
		if (n == 0) {
			return;
		}else{
			System.out.println(n);
			add(n - 1);
			System.out.println(n);
		}
	}
}
