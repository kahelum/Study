package Study;

import java.util.Scanner;

public class Note {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String a = in.next();
		char arr[] = a.toCharArray();
		for (char c : arr) {		// foreach ¹®
			System.out.println("'" + c + "'");
		}
		 
	}
}
