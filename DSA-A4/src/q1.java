import java.util.Scanner;

class Node{
	protected int regd_no;
	protected float mark;
	protected Node next;
}

public class q1 {
	static Node start;
	static Node P1;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int ch; 
		char op='y';
		do {
			System.out.println("MAIN MENU");
			System.out.println("---------");
			System.out.println("1. CREATE");
			System.out.println("2. DISPLAY");
			System.out.println("3. SEARCH");
			System.out.println("7. EXIT");
			System.out.print("\nENTER YOUR CHOICE: ");
			ch = sc.nextInt();
			switch(ch) {
				case 1:
					create();
					break;
				case 2:
					display(start);
					break;
				case 3:
					search(start);
					break;
				case 7:
					System.exit(0);
				default:
					System.out.println("Invalid choice");
			}
			
			System.out.print("Want to continue? (y/n): ");
			op = sc.next().charAt(0);
		} while (op=='y');
		
		sc.close();
	}
	
	public static void create() {
		Node obj = new Node();
		System.out.print("\nEnter your regd no and marks: ");
		obj.regd_no = sc.nextInt();
		obj.mark = sc.nextFloat();
		obj.next = null;
		start = obj;
		P1 = start;
		
		System.out.print("Enter number of nodes: ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			P1.next = new Node();
			P1 = P1.next;
			System.out.print("Enter your regd no and marks: ");
			P1.regd_no = sc.nextInt();
			P1.mark = sc.nextFloat();
			P1.next = null;
			System.out.println();
		}
	}
	
	public static void display(Node start) {
		if (start == null) {
			System.out.println("Linked List doesnot exist");
		} else {
			P1 = start;
			while(P1!=null) {
				System.out.println("Registration No: "+P1.regd_no);
				System.out.println("Marks: "+P1.mark);
				P1 = P1.next;
			}
		}
	}
	
	public static void search(Node start) {
		if (start == null) {
			System.out.println("Linked List doesnot exist");
		} else {
			System.out.print("Enter regd no to search: ");
			int item = sc.nextInt();
			P1 = start;
			
			while(P1.next!=null) {
				if(item==P1.regd_no) {
					System.out.println("Item found");
					break;
				} 
				P1 = P1.next;
			}
		}
	}
}



