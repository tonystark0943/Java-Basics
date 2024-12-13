// Author Name: James Bond
// Assignment No: 2
// Question No:6
// Lab Class No: 3
// Lab Date - November 22, 2024
import java.util.Scanner;
public class question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double d,t,g=32.174;
		System.out.print("Enter the number of seconds travelled: ");
		t = sc.nextDouble();
		d = (g*t*t)/2;
		System.out.printf("Distance travelled: %.2f",d);
		sc.close();
	}

}
