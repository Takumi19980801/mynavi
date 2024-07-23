package mynavi2;

public class Sample_Array {

	public static void main(String[] args) {
		int[]		array0;
		array0 = new int[] {5};
		for(int array:array0)	{
			System.out.println(array);
		}
		
		int[]		array1 = {0};
		int[][]		array2 = {{0,1},{1,2}};
		int[][][]	array3 = {{{0},{0},{0}},{{0},{0},{0}}};
		for(int[][] three:array3)	{
			for(int[] two:three)	{
				for(int one:two)	{
					System.out.println(one);
				}
			}
		}
	}

}
