package mynavi1;

public class Sample1_53 {

	public static void main(String[] args) {
		//xをfloat型に変えることで、浮動小数点数まで出力される
		byte x = 5, y = 2;
		float a = Math.round((float) x / y * 100) / (float) 100;
		System.out.println(a);
	}

}
