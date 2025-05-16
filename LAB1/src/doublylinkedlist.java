import java.util.Scanner;

class Node{
	protected int regd_no;
	protected float mark;
	protected Node prev;
	protected Node next;
	
	Node(int regd_no, float mark){
		this.regd_no = regd_no;
		this.mark = mark;
		this.prev = null;
		this.next = null;
	}
}

public class doublylinkedlist {
	
	static Node start, p1, p2;
	static Scanner sc = new Scanner(System.in);
	
	public static Node creation(Node start) {
		int reg; float marks;
		System.out.print("Enter your regd no and marks: ");
		reg = sc.nextInt();
		marks = sc.nextFloat();
		Node obj = new Node(reg, marks);
		start = obj;
		p1 = start;
		
		System.out.print("Enter number of nodes: ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.print("Enter your regd no and marks: ");
			reg = sc.nextInt();
			marks = sc.nextFloat();
			p1.next = new Node(reg, marks);
			p2 = p1;
			p1.prev = p2; 
			p1 = p1.next;
			System.out.println();
		}
		
		return start;
	}
	
	public static void display(Node start) {
		p1 = start;
		if (p1 == null) {
			System.out.println("Doubly Linked List doesnot exist");
		} else {
			while(p1!=null) {
				System.out.println(p1.regd_no+"----->"+p1.mark+"----->");
				p1 = p1.next;
			}
		}
	}
	
	public static int countNode(Node start) {
		int count=0;
		
		if (start==null)
			return count;
		else if(start.next==null) {
			count++;
			return count;
		} 
		else {
			p1 = start;
			while (p1!=null) {
				count++;
				p1=p1.next;
			}
			return count;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		start = creation(start);
		display(start);
	}

}
