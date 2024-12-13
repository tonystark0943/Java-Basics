// Author Name: James Bond
// Assignment No: 2
// Question No:4
// Lab Class No: 3
// Lab Date - November 22, 2024
import java.util.Scanner;
public class question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num, sum=0;
		System.out.print("Enter a number between 0 and 1000: ");
		num = sc.nextInt();
		sum += num%10;
		num = num/10;
		sum += num%10;
		num = num/10;
		sum += num%10;
		System.out.println("The sum of digits is "+sum);
		sc.close();
	}

}
