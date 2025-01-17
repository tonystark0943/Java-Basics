import java.util.Scanner;

public class qs3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int num1 = sc.nextInt(), num2 = sc.nextInt();
		int count = 0;
		for ( ;num1<=num2;num1++) {
			for (int i=2;i<=num1/2;i++) {
				if (num1%i==0)
					count = 1;
			}
			if (count==0)
				System.out.print(num1+" ");
		}
		
	}

}
