import java.util.Scanner;

public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
		boolean bool = isOdd(num);
		System.out.println(num+" is odd: "+bool);
		sc.close();
	}
	
	public static boolean isOdd(int n) {
		if(n%2==0)
			return false;
		else
			return true;
	}

}
