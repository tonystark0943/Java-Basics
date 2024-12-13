// Author Name: James Bond
// Assignment No: 3
// Question No: 7
// Lab Class No: 7
// Lab Date - December 13, 2024

import java.util.Scanner;
public class qs7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amt = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter monthly consumption in units: ");
		int units = sc.nextInt();
		if (units>=0 && units<=50) {
			amt = units*3;
		} else if (units>50 && units<=200) {
			amt = 150+((units-50)*4.80);
		} else if (units>200 && units<=400) {
			amt = 150 + 150*4.80 + (units-200)*5.80; 
		} else if (units>400) {
			amt = 150 + 150*4.80 + 200*5.80 + (units-400)*6.20;
		}
		System.out.println("Bill: Rs."+amt);
		System.out.println("Do you want to pay online (Y/N)?");
		String choice = sc.next();
		if (choice.charAt(0) == 'Y') {
			System.out.println("Discount: Rs."+amt*3/100);
			System.out.println("Amount payable: Rs."+amt*97/100);			
		} else if (choice.charAt(0) == 'N') {
			System.out.println("Sorry! You have got no discount!");
		} else {
			System.out.println("Invalid choice! Try again!");
		}
		sc.close();
	}

}
