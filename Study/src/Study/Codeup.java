package Study;

import java.util.Scanner;

public class Codeup {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int score = in.nextInt();
		
		if (score>=90 && score<=100) {
			System.out.println("A");
		} else if (score>=70 && score<=89) {
			System.out.println("B");
		} else if (score>=40 && score<=69) {
			System.out.println("C");
		} else if (score>=0 && score<=39) {
			System.out.println("D");
		}
		
	}
}

