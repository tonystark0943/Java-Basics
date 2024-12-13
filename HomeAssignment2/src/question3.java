// Author Name: James Bond
// Home Assignment No: 2
// Question No:3
// Lab Class No: 3
// Lab Date - November 22, 2024

import java.util.Scanner;
public class question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter three points for a triangle: ");
		double x1 = sc.nextDouble(),y1 = sc.nextDouble(),x2 = sc.nextDouble(),y2 = sc.nextDouble(),x3 = sc.nextDouble(),y3 = sc.nextDouble();
		double side1 = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
		double side2 = Math.sqrt(((x3-x2)*(x3-x2))+((y3-y2)*(y3-y2)));
		double side3 = Math.sqrt(((x3-x1)*(x3-x1))+((y3-y1)*(y3-y1)));
		double s = (side1+side2+side3)/3;
		double area = Math.sqrt((s*(s-side1)*(s-side2)*(s-side3)));
		System.out.println("The area of the triangle is "+area+" sq. units");
		sc.close();
		
	}

}
