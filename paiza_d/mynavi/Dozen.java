package mynavi;

import java.util.Scanner;

public class Dozen {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = Integer.parseInt(sc.nextLine());
        line = line * 12;
        System.out.println(line);
        sc.close();
	}

}
