import java.util.Scanner;

class Node{
	int info;
	Node next;
	
	Node(int info){
		this.info = info;
		this.next = null;
	}
}

public class q2 {
	static Scanner sc = new Scanner(System.in);
	static Node top, p1, start=null; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("*** STACK MENU ***");
			System.out.println("0. EXIT");
			System.out.println("1. PUSH");
			System.out.println("2. POP");
			System.out.println("3. DISPLAY");
			System.out.print("\nENTER CHOICE: ");
			int choice = sc.nextInt();
			switch(choice) {
				case 0:
					System.out.println("Exiting...");
					System.exit(0);
				case 1:
					top = push(top);
					break;
				case 2:
					top = pop(top);
					break;
				case 3:
					display(top);
					break;
				default:
					System.out.println("Invalid choice");
			}
		}
	}
	
	public static Node push(Node top) {
		System.out.println("Enter an integer: ");
		int item = sc.nextInt();
		
		if (top==null) {
			System.out.println("Stack is Empty");
			Node obj = new Node(item);
			top = obj;
			
		} else {
			Node obj = new Node(item);
			obj.next = top;
			top = obj;
		}
		System.out.println("Pushed item: "+item);
		
		return top;
	}
	
	public static Node pop(Node top) {
		if(top==null)
			System.out.println("Stack Underflow");
		else if(start==top) {
			System.out.println(top.info+" is deleted");
			start = top = null;
		}
		else {
			Node p = start;
			System.out.println(p.info);
			top = null;
		}
		
		return top;
	}
	
	public static void display(Node top) {
		p1 = top;
		
		if(top==null)
			System.out.println("Stack is Empty");
		else {
			System.out.println("Stack Elements: ");
			while(p1!=null) {
				System.out.println(p1.info);
				p1 = p1.next;
			}
		}
	}

}
