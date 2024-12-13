// Author Name: Ruskin Bond
// Assignment No: 3
// Question No:3
// Lab Class No: 6
// Lab Date - December 6, 2024

import java.util.Scanner;
public class qs3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input first number: ");
		int num1 = sc.nextInt();
		System.out.print("Input second number: ");
		int num2 = sc.nextInt();
		System.out.print("Input third number: ");
		int num3 = sc.nextInt();
		
		if (num1<num2 && num2<num3)  {
			System.out.println("Increasing");
		} else if (num3>num2 && num2>num1){
			System.out.println("Decreasing");
		} else {
			System.out.println("Neither increasing nor decreasing");
		}
		sc.close();
	}

}
