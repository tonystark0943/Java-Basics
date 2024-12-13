// Author Name: James Bond
// Assignment No: 3
// Question No: 9
// Lab Class No: 7
// Lab Date - December 13, 2024

import java.util.Scanner;
public class qs9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter three numbers: "); 
		int a = sc.nextInt(); 
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a>b && a>c) {
			System.out.println("Largest: "+a);
			if (b>c) {
				System.out.println("Second Largest: "+b);
			} else {
				System.out.println("Second Largest: "+c);
			}
		} else if (b>a && b>c) {
			System.out.println("Largest: "+b);
			if (a>c) {
				System.out.println("Second Largest: "+a);
			} else {
				System.out.println("Second Largest: "+c);
			}
		} else if (c>a && c>b) {
			System.out.println("Largest: "+c);
			if (a>b) {
				System.out.println("Second Largest: "+a);
			} else {
				System.out.println("Second Largest: "+b);
			}
		} else {
			System.out.println("Two or more numbers are equal. Try again!");
		}
		sc.close();
	}

}
