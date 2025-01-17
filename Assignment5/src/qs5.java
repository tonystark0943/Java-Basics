import java.util.Scanner;

public class qs5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int m = sc.nextInt(), n = sc.nextInt();
		for ( ;m<=n;m++) {
			for(int i=1;i<=10;i++) {
				System.out.println(m+" x "+i+" = "+m*i);
			}
		}
	}

}
