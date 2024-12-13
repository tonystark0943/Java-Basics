// Author Name: Ruskin Bond
// Assignment No: 3
// Question No:1
// Lab Class No: 6
// Lab Date - December 6, 2024


import java.util.Scanner;
public class qs1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		if (age>=18) {
			System.out.println("You are eligible to cast your vote.");
		}
		sc.close();
	}

}
