package Study;

import java.util.Scanner;

public class Codeup {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		int i = 0;
		while(true) {
			if(i > num) {
				break;
			}
			System.out.println(i);
			i++;
		}
	}
}

