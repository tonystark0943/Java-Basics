package a2;
import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book[] obj = new Book[5];
		int b,q; double p,tA=0;
		for(int i=0;i<5;i++) {
			System.out.print("Enter bookid, price and quantity: ");
			b=sc.nextInt();p=sc.nextDouble();q=sc.nextInt();
			obj[i]=new Book(b,p,q);
			obj[i].displayDetails();
			tA = obj[i].totalCost();
			
		}
		System.out.println("Total cost of book: "+tA);
		sc.close();
	}

}

class Book{
	Scanner sc = new Scanner(System.in);
	int bookId,quantity;
	double price;
	static double totalAmount;
	
	Book(int bookId,double price, int quantity){
//		System.out.println("Enter book id, price and quantity: ");
		this.bookId=bookId; this.price=price; this.quantity=quantity;
	}
	
	void displayDetails() {
		System.out.println("Book ID: "+bookId+"\nPrice: "+price+"\nQuantity: "+quantity);
	}
	
	double totalCost() {
		totalAmount = totalAmount + price*quantity;
		return totalAmount;
	}
}