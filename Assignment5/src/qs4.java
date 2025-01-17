import java.util.Scanner;

public class qs4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int m = sc.nextInt(), n = sc.nextInt(), num=0, fact = 1;
		if (m>0 && n>0 && m<n) {
			for ( ;m<=n;m++) {
				num=m;
				while(num>0) {
					fact=fact*num;
					num--;
				}
				System.out.println(fact+" ");
				fact=1;
			}
		}
	}

}
