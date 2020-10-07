import java.util.*;

public class GuessingGame {
		
	public int number;

	public GuessingGame (int number) {
		this.number = number;
	}

	public static void main (String[] args) {
			
		GuessingGame game = new GuessingGame (10);

		while (true) {
			
			System.out.print("Enter the number: ");
			Scanner input = new Scanner (System.in);

			int n = input.nextInt();
			if (n > game.number) {
				System.out.println("Too High");
			} else if (n < game.number) {
				System.out.println("Too Low");
			} else {
				System.out.println("YOU WON!");
				break;
			}
		}
	}
}
