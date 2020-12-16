package Study;

import java.util.Scanner;

public class Alphabetic_transformation {

	public static void main(String[] args) {
		Scanner alphabet = new Scanner(System.in);
		System.out.print("Enter an alphabet : ");
		while (true) {
			char Alphabet = alphabet.next().charAt(0); // String Alphabet = alphabet.next();
			if (Alphabet>=65 && Alphabet<=90) {
				Alphabet += 32;
				System.out.println(Alphabet);
			} else if (Alphabet>=97 && Alphabet<=122) {
				Alphabet -= 32;
				System.out.println(Alphabet);
			} else {
				System.out.println("Invalid input");
			}
		}

	}

}
