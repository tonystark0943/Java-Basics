import java.util.Scanner;
public class qs8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter range: ");
		int n=sc.nextInt();
		double sum=0;
		for (int i=1;i<=n;i++) {
			sum=sum+(double)1/(i*i);
		}
		System.out.println(sum);
	}

}
