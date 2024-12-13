// Author Name: Ruskin Bond
// Assignment No: 3
// Question No:4
// Lab Class No: 6
// Lab Date - December 6, 2024

import java.util.Scanner;
public class qs4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number between 1 to 9: ");
		int user_guess = sc.nextInt();
		int comp_guess = (int)(Math.random()*9)+1;
		System.out.println("Computer guesses: "+comp_guess);
		if (user_guess == comp_guess) {
			System.out.println("You got it right");
		} else if(user_guess+1 == comp_guess || user_guess-1 == comp_guess) {
			System.out.println("Almost got it");
		} else {
			System.out.println("You got it wrong");
		}
		sc.close();
	}

}
