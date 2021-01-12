package Study;

import java.util.Scanner;

public class Note {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int a[] = new int[5];
		int input = in.nextInt();
		int j = 10000;
		
		for (int i = 0; i<a.length; i++) {
			a[i] = (input / j) * j;
			System.out.println("["+a[i]+"]");
			input = input % a[i];
			j = j / 10;
		}
	}
}

/*
		Scanner sc = new Scanner(System.in);        
		String a = sc.next();
		char [] arr = a.toCharArray();   
		for(int i=0; i<arr.length; i++) {
    		System.out.print("[" + arr[i]);
    		for(int j=arr.length-1; j>i; j--) { 
        		System.out.print("0");          
    		}
    		System.out.println("]");
		}

*/

//