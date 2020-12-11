package Study;
import java.util.Scanner;

public class Rock_Paper_Scissors_Game {

	public static void main(String[] args) {
		String CheolSu;
		String YoungHee;
		Scanner var = new Scanner(System.in);
		System.out.println("rock, paper, scissors game");
		
		do {
			while(true) {
				System.out.print("CheolSu : ");
				CheolSu = var.next();
				if (CheolSu.equals("rock") || CheolSu.contentEquals("paper")  
					|| CheolSu.contentEquals("scissors")) {
					break;
				}
			else {
				System.out.println("Invalid input");
			}
		}
			
			while(true) {
				System.out.print("YoungHee : ");
				YoungHee = var.next();
				if (YoungHee.equals("rock") || YoungHee.contentEquals("paper")  
						|| YoungHee.contentEquals("scissors")) {
					break;
				}
				else {
					System.out.println("Invalid input");
				}
			}
			
			if (CheolSu.equals("rock") && YoungHee.equals("scissors") || 
					CheolSu.equals("paper") && YoungHee.equals("rock") ||
					CheolSu.equals("scissors") && YoungHee.equals("paper"))
				System.out.println("CheolSu is win");
			else if (YoungHee.equals("rock") && CheolSu.equals("scissors") || 
					YoungHee.equals("paper") && CheolSu.equals("rock") ||
					YoungHee.equals("scissors") && CheolSu.equals("paper"))
				System.out.println("YoungHee is win");
			else 
				System.out.println("Tie");
		
		} while (CheolSu.equals("rock") && CheolSu.contentEquals("paper")  
				&& CheolSu.contentEquals("scissors") && YoungHee.equals("rock") 
				&& YoungHee.contentEquals("paper") 
				&& YoungHee.contentEquals("scissors"));
	}
}
