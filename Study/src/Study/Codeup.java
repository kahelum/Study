package Study;

import java.util.Scanner;

public class Codeup {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String time = in.next();
		String arr[] = time.split(":");
		
		System.out.println(Integer.parseInt(arr[1]));
		
	}

}
