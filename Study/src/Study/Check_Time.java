package Study;

public class Check_Time {

	public static void main(String[] args) {
		int i;
		for (i=5; i>0; i--) {
			for (int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

/*
package Study;

public class Note {

	public static void main(String[] args) {
		int i = 5;
		int j;
		
		while (i>0) {
			j = 0;
			while (j++<i) {
				System.out.print("*");
			}
			System.out.println();
			i--;
		}

	}

}
*/

/*
package Study;

public class Note {

	public static void main(String[] args) {
		int i=5;
		int j;
		
		do {
			j=0;
			while (j++<i) {
				System.out.print("*");
			}
			System.out.println();
			i--;
		} while (i>0);

	}

}
*/