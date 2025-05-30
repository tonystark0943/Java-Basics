//import java.util.Scanner;
//
//class Node{
//	int info;
//	Node next;
//}
//
//
//public class StackUsingLinkedList {
//	
//	static Node start = null;
//	static Scanner sc = new Scanner(System.in);
//	static Node top = null;
//	
//	public static void push() {
//		Node p = new Node();
//		System.out.println("Enter info: ");
//		p.info = sc.nextInt();
//		p.next = null;
//		
//		start = p;
//		top = p;
//		System.out.println("Do u want to create more(y/n)? ");
//		char ch = sc.next().toLowerCase().charAt(0);
//		while(ch=='y') {
//			p = new Node();
//			System.out.println("Enter info: ");
//			p.info = sc.nextInt();
//			p.next = null;
//		}
//	}
//	
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
