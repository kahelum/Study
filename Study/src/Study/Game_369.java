package Study;

import java.util.Scanner;

public class Game_369 {

	public static void main(String[] args) {
		Scanner Integer = new Scanner(System.in);
		System.out.print("Enter an integer (1~99) : ");
		int integer = Integer.nextInt();
		
		int Double_digit = integer / 10;
		int Single_digit = integer % 10;
		switch (Double_digit) {
			case 3:
			case 6:
			case 9:
				if (Single_digit == 3 || Single_digit == 6 || Single_digit == 9)
					System.out.println("Double clap");
				else 
					System.out.println("Clap");
				break;
			default:
				if (Single_digit == 3 || Single_digit == 6 || Single_digit == 9)
					System.out.println("Clap");
				break;
		}
	}

}
