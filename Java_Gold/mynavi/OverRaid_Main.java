package mynavi;

public class OverRaid_Main {

	public static void main(String[] args) {
		OverRaid_Taxi taxi = new OverRaid_Taxi();
		//スーパークラスから継承したメソッドの呼び出し
		taxi.setDate(4, 60);
		taxi.disp();
		
		//サブクラスから定義したメソッドの呼び出し
		taxi.setFare(1000);
		taxi.dispFare();
		
		//スーパークラスから継承したメソッドの呼び出し
		taxi.run();
	}

}
