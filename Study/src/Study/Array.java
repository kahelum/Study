package Study;

public class Array {

	public static void main(String[] args) {
		int Array[][] = new int[4][];
		Array[0] = new int[4];
		Array[1] = new int[1];
		Array[2] = new int[1];
		Array[3] = new int[4];
		int sum = 0;
		
		for (int i=0; i<Array[0].length; i++) {
			Array[0][i] = sum++;
		}
		Array[1][0] = sum++;
		Array[2][0] = sum++;
		for (int i=0; i<Array[3].length; i++) {
			Array[3][i] = sum++;
		}
		
		for (int i=0; i<Array.length; i++) {
			for (int j=0; j<Array[i].length; j++) {
				System.out.print(Array[i][j]);
			}
			System.out.println();
		}
		
	}
}
