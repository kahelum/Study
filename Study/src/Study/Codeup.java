package Study;

import java.util.Scanner;

public class Codeup {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		long a = in.nextLong();
		long b = in.nextLong();
		long c = in.nextLong();
		
		System.out.println((a<b ? a:b)<c ? (a<b ? a:b):c);
		
	}
}

