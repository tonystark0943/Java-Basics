// Author Name: James Bond
// Home Assignment No: 2
// Question No:1
// Lab Class No: 3
// Lab Date - November 22, 2024

import java.util.Scanner;
public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of minutes: ");
		int time = sc.nextInt();
		System.out.println(time+" minutes is approximately "+time/365+" years and "+time%365+" days");
		sc.close();
	}

}
