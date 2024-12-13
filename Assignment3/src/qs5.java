// Author Name: Ruskin Bond
// Assignment No: 3
// Question No:5
// Lab Class No: 6
// Lab Date - December 6, 2024

import java.util.Scanner;
public class qs5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input year: ");
		int year = sc.nextInt();
		if ((year%4==0 && year%100!=0) || (year%400==0)) {
			System.out.println(year+" is a leap year: true");
		} else {
			System.out.println(year+" is a leap year: false");			
		}
		sc.close();
	}

}
