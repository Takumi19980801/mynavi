package mynavi;

public class OverRaid_Taxi extends OverRaid_Car {
	private int fare;	//燃料
	
	/*料金設定メソッド*/
	public void setFare(int fare)	{
		this.fare = fare;
	}
	
	/*料金表示メソッド*/
	public void dispFare()	{
		System.out.println("料金は、" + fare + "円");
	}
	
	/*run()メソッドのオーバーライド*/
	public void run()	{
		System.out.println("お客様を乗せて走る");
	}
}
