// Author Name: James Bond
// Assignment No: 3
// Question No: 10
// Lab Class No: 7
// Lab Date - December 13, 2024

import java.util.Scanner;
public class qs10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter marks secured: ");
		int marks = sc.nextInt();
		
		switch (marks/10){
			case 10:
			case 9:
				System.out.println("Grade: O");
				break;
			case 8:
				System.out.println("Grade: A");
				break;
			case 7:
				System.out.println("Grade: B");
				break;
			case 6:
				System.out.println("Grade: C");
				break;
			case 5:
				System.out.println("Grade: D");
				break;
			case 4:
				System.out.println("Grade: E");
				break;
			case 3:
			case 2:
			case 1:
				System.out.println("Grade: F");
				break;
		}
		sc.close();
	}

}
