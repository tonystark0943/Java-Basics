import java.util.Random;
import java.util.Scanner;

public class qs1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("Rock (0) Paper (1) Scissor (2): ");
		int user = sc.nextInt();
		int comp = rand.nextInt(3);
		System.out.println("Computer Guess: "+comp);
		if (user == comp) {
			System.out.println("Tie");
		} else {
			if (comp>user) {
				System.out.println("You lose!");
			} else {
				System.out.println("You win!");
			}
		}
		sc.close();
	}

}
