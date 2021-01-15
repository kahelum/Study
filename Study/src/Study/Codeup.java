package Study;

import java.util.Scanner;

public class Codeup {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String time = in.next();
		String arr[] = time.split("\\.");
		
		String year = arr[0];
		String month = arr[1];
		String day = arr[2];
		
		System.out.println(day+"-"+month+"-"+year);
		
	}

}

//