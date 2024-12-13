// Author Name: James Bond
// Assignment No: 3
// Question No:6
// Lab Class No: 6
// Lab Date - December 6, 2024

import java.util.Scanner;
public class qs6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amt = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter monthly consumption in units: ");
		int units = sc.nextInt();
		if (units>=0 && units<=50) {
			amt = units*3;		} else if (units>50 && units<=200) {
			amt = 150+((units-50)*4.80);
		} else if (units>200 && units<=400) {
			amt = 150 + 150*4.80 + (units-200)*5.80; 
		} else if (units>400) {
			amt = 150 + 150*4.80 + 200*5.80 + (units-400)*6.20;
		}
		System.out.println("Bill: Rs."+amt);
		sc.close();
	}

}
