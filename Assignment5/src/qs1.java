import java.util.Scanner;

public class qs1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter another number: ");
		int num2 = sc.nextInt();
		int sum1=0,sum2=0;
		for (int i=1;i<num1;i++) {
			if (num1%i==0)
				sum1+=i;
		}
		for (int j=1;j<num2;j++) {
			if (num2%j==0)
				sum2+=j;
		}
		if (sum1==num1 && sum2==num2)
			System.out.println(num1+" & "+num2+" are amicable numbers");
		else
			System.out.println(num1+" & "+num2+" are not amicable numbers");
		
		sc.close();
	}

}
