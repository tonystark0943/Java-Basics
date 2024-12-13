// Author Name: James Bond
// Assignment No: 2
// Question No:5
// Lab Class No: 3
// Lab Date - November 22, 2024
import java.util.Scanner;
public class question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r,surface_area, volume;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of the hemisphere: ");
		r = sc.nextDouble();
		surface_area = 3*Math.PI*r*r;
		volume = (2*Math.PI*r*r*r)/3;
		System.out.println("The surface area of the hemisphere is "+surface_area);
		System.out.println("The volume of the hemisphere is "+volume);
		sc.close();
		
	}

}
