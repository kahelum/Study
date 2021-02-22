package Book;

import java.util.Scanner;

class Player {
	
	Scanner inputWord = new Scanner(System.in);
	
	public String PlayerName;
	public String Word;
	
	public String sayWord() {
		Word = inputWord.next();
		return Word;
	}
	
	public boolean succeed(char lastChar) {
		if(lastChar == Word.charAt(0)) return true;
		else return false;
	}
	
}

public class Word_Chain {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String StartWord = "Rich";
		System.out.printf("How many people are participating in the game? ");
		
		int PlayerNumbers = sc.nextInt();
		Player[] play = new Player[PlayerNumbers];
		
		for(int i=0; i<PlayerNumbers; i++) {
			System.out.printf("Please enter a participant's name : ");
			play[i] = new Player();
			play[i].PlayerName = sc.next();
		}
		
		System.out.println("The starting word is \"Rich\".");
		
		int i = 0, j = 0;
		while(true) {
			j = i % PlayerNumbers;
			int lastIndex = StartWord.length()-1;
			char lastChar = StartWord.charAt(lastIndex);
			
			System.out.printf(play[j].PlayerName + " >> ");
			play[j].sayWord();
			boolean continuing = play[j].succeed(lastChar);
			if(continuing == false) {
				System.out.println(play[j].PlayerName + " is lose.");
				break;
			}
			StartWord = play[j].Word;
			i++;
		}
		
	}

}
