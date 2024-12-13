// Author Name: James Bond
// Assignment No: 3
// Question No: 7
// Lab Class No: 7
// Lab Date - December 13, 2024

import java.util.Scanner;
public class qs8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x coordinates: ");
		double x = sc.nextDouble();
		System.out.print("Enter y coordinates: ");
		double y = sc.nextDouble();
		if (x>0 && y>0) {
			System.out.println(x+","+y+" is in 1st Quadrant");
		} else if (x<0 && y>0) {
			System.out.println(x+","+y+" is in 2nd Quadrant");
		} else if (x<0 && y<0) {
			System.out.println(x+","+y+" is in 3rd Quadrant");
		} else if (x>0 && y<0) {
			System.out.println(x+","+y+" is in 4th Quadrant");
		} else if (x==0 && y==0) {
			System.out.println("Its the origin point");
		} else if (x==0) {
			System.out.println("The point is in y-axis");
		} else {
			System.out.println("The point is in x-axis");
		}
		sc.close();
	}

}
