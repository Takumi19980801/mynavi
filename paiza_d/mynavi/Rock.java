package mynavi;

import java.util.Scanner;

public class Rock {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            String token1 = sc.next();
            String token2 = sc.next();
            if ((token1 == "G" && token2 == "C") || (token1 == "C" && token2 == "P") || (token1 == "P" && token2 == "G")) {
            	c = c + 1;
            	System.out.println(c);
            }
            
        }
        System.out.println(c);
	}

}
