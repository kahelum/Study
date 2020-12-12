package Study;

import java.util.Scanner;

public class Exchange {

	public static void main(String[] args) {
		Scanner money = new Scanner(System.in);
		System.out.print("Enter an integer to exchange : ");
		int Money = money.nextInt();
		int Fifty_thousand = Money / 50000;
		int Ten_thousand = (Money % 50000 ) / 10000;
		int Five_Thousand = (Money % 10000) / 5000;
		int Thousand = (Money % 5000) / 1000;
		int Five_hundred = (Money % 1000) / 500;
		int Hundred = (Money % 500) / 100;
		int Fifty = (Money % 100) / 50;
		int Ten = (Money % 50) / 10;
		System.out.println("Fifty_thousand Won = "+Fifty_thousand+"\nTen_thousand = "+Ten_thousand
				+"\nFive_Thousand = "+Five_Thousand+"\nThousand = "+Thousand
				+"\nFive_hundred = "+Five_hundred+"\nHundred = "+Hundred+"\nFifty = "+Fifty
				+"\nTen = "+Ten);

	}

}
