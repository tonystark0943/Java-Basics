// Author Name: Ruskin Bond
// Assignment No: 3
// Question No:2
// Lab Class No: 6
// Lab Date - December 6, 2024

import java.util.Scanner;
public class qs2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your daily intake of water: ");
		int qty = sc.nextInt();
		if (qty>=5000) {
			System.out.println("Yes, Alice is following doctor\'s advice");
		} else {
			System.out.println("No, Alice is not following doctor\'s advice");
		}
		sc.close();
	}

}
