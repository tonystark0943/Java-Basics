import java.util.Scanner;

public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array row size: ");
		int m=sc.nextInt();
		System.out.println("Enter array coloumn size: ");
		int n=sc.nextInt();
		int arr[][] = new int[m][n];
		for (int i=0;i<m;i++) {
			for (int j=0;j<n;j++) {
				System.out.println("Enter an element: ");
				arr[i][j] = sc.nextInt();				
			}
		}
		int sum=0;
		for (int a=0;a<m;a++) {
			for (int b=0;b<n;b++) {
				sum+=arr[a][b];
				System.out.print(arr[a][b]+" ");
			}
			System.out.println();
		}
		System.out.println("Sum of elements: "+sum);
		sc.close();
	}

}
