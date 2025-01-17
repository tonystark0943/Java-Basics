
public class qs7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(j+" ");
				sum+=j;
			}
			System.out.println();
		}
		System.out.println(sum);
	}

}
