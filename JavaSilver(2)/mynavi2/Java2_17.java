package mynavi2;

public class Java2_17 {

	public static void main(String[] args) {
		//配列の生成と初期化の方法
		int[] pop = new int [] {1,2,3};
		int[] num = {1,2,3};
		int[] sus = new int[3];
		sus = new int[]{1,2,3};
		
		for(int i:pop) {
			System.out.println(i);
		}
		for(int i:num) {
			System.out.println(i);
		}
		for(int i:sus) {
			System.out.println(i);
		}
	}

}
