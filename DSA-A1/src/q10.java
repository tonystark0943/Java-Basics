import java.util.Scanner;

public class q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double arr[][] = new double[3][4];
		for (int i=0;i<3;i++) {
			for (int j=0;j<4;j++) {
				System.out.println("Enter an element: ");
				arr[i][j] = sc.nextDouble();				
			}
		}
		System.out.print("Enter the col index to find its sum: ");
		int idx=sc.nextInt();
		double sumCol = sumColumn(arr,idx);
		System.out.println("The sum of elements in col "+idx+" is "+sumCol);
		sc.close();
	}
	
	public static double sumColumn(double[][] m, int columnIndex) {
		double sum=0;
		for (int a=0;a<3;a++) {
			for (int b=0;b<4;b++) {
				if(b==columnIndex)
					sum+=m[a][b];
			}
			
		}
		
		return sum;
	}

}
