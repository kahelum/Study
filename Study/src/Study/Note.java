package Study;

import java.util.Scanner;

public class Note {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String RRN = in.next();
		String data[] = RRN.split("-");
		
		System.out.println(data[0]+data[1]);
		
	}
}
