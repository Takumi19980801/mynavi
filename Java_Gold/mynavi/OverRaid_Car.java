package mynavi;

public class OverRaid_Car {
	private int fuel;	//燃料
	private int speed;	//速度
	
	//データ設定メソッド
	public void setDate(int fuel, int speed) {
		this.fuel = fuel;
		this.speed = speed;
	}
	
	/*燃料、速度表示メソッド*/
	public void disp() {
		System.out.println("燃料は、" + fuel + "リットル");
		System.out.println("速度は、" + speed + "km");
	}
	
	public void run() {
		System.out.println("走る");
	}
}