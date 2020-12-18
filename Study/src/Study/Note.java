package Study;

import java.util.Scanner;

public class Note {

	public static void main(String[] args) {
		Scanner star = new Scanner(System.in);
		
		System.out.print("Enter an integer : ");
		int Star = star.nextInt();
		
		for(int i=1; i<=Star; i++) {
			for(int j=Star; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
