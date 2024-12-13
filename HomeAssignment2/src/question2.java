// Author Name: James Bond
// Home Assignment No: 2
// Question No:2
// Lab Class No: 3
// Lab Date - November 22, 2024

import java.util.Scanner;
public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of eggs you have: ");
		int no_of_eggs = sc.nextInt();
		System.out.println("Your number of eggs is "+no_of_eggs/144+" gross, "+no_of_eggs/12+" dozen, and "+no_of_eggs%12+ " left");
		sc.close();
	}

}
