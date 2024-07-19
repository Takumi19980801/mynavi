package mynavi2;

public class Java2_7 {

	public static void main(String[] args) {
		//明示的型変換
		short a = 97;
		char A = (char)a;
		//明示的型変換
		int b = 98;
		char B = (char)b;
		//明示的型変換
		char c = 'c';
		byte C = (byte)c;
		//明示的型変換
		char d = 'd';
		short D = (short)d;
		//暗黙的型変換
		char e = 'e';
		int E = e;
		//暗黙的型変換
		char f = 'f';
		long F = f;
		//暗黙的型変換
		char g = 'g';
		float G = g;
		System.out.println(A + " ");
		System.out.println(B);
		System.out.println(C);
		System.out.println(D);
		System.out.println(E);
		System.out.println(F);
		System.out.println(G);
	}

}
