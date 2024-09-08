package mynavi;

public class Class_Instance_Main {

	public static void main(String[] args) {
		//クラスメソッド
		double area1 = Class_Method.calcArea(10.0, 20.0);
		System.out.println("三角形の面積：" + area1);
		//インスタンスメソッド
		/*クラスメソッドからインスタンスメソッドを呼び出す場合は
		 オブジェクトを生成する必要がある*/
		Instance_Method instance = new Instance_Method();
		double area2 = instance.calcArea(20.0, 20.0);
		System.out.println("三角形の面積：" + area2);
	}

}
