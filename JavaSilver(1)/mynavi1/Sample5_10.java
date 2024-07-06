package mynavi1;

public class Sample5_10 {

	public static void main(String[] args) {
		//3つの要素を持つ2次元配列
		//arrayA[0] : {1, 2}
		//arrayA[1] : {1, 2}
		//arrayA[2] : {1, 2, 3}
		int[][] arrayA = { {1,2},{1,2},{1,2,3} };
		int[][] arrayB = arrayA.clone();
		int total = 0;
		for (int[] tmp : arrayB) {
			for (int val : tmp) {
				total += val;
			}
		}
		System.out.println(total);
	}

}
