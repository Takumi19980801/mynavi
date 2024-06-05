package mynavi;

import java.util.Scanner;

public class Candy {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int candy = Integer.parseInt(sc.nextLine());
        candy = candy / 10;
        System.out.println(candy);
        sc.close();
	}

}
