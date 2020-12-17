package Study;

public class Note {

	public static void main(String[] args) {
		float a[][] = new float[4][];
		a[0] = new float[4];
		a[1] = new float[2];
		a[2] = new float[3];
		a[3] = new float[4];
		
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
