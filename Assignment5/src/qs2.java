import java.util.Scanner;

public class qs2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt(), onum = num, revnum = 0;
		int count=0, count2=0;
		for (int i=2;i<=num/2;i++) {
			if (num%i==0) {
				count=1;
			}
		}
		if(count==0) {
			while(onum>0) {
				revnum=revnum*10+onum%10;
				onum=onum/10;
			}
		}
		for (int j=2;j<=revnum/2;j++) {
			if (revnum%j==0) {
			  count2=1;	
			}
		}
		if (count==0 && count2==0)
			System.out.println(num+" & "+revnum+" are twisted prime");
		else
			System.out.println(num+" & "+revnum+" are not twisted prime");
		
		sc.close();
	}

}
