package Study;

import java.util.Scanner;

public class Codeup {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		long result = a;
		
		for(int i=1; i<d; i++) {
			result = (result*b)+c;
		}
		System.out.print(result);
	}
}
//