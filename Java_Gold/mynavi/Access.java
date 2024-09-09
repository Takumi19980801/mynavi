package mynavi;

public class Access {
	//インスタンスメソッドからクラス変数・インスタンス変数にアクセスできる
	int instanceVal;
	static int staticVal;
	int methodA()	{ return instanceVal;}
	int methodB()	{ return staticVal;}
	/*クラスメソッドからクラス変数にはアクセスできるが、
	 インスタンス変数にアクセスするにはオブジェクトを生成する必要がある*/
	static int methodD()	{return staticVal;}
	static int methodE()	{
		Access obj = new Access();
		return obj.instanceVal;
	}
}