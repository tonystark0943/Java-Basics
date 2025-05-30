import java .util.Scanner;

public class q1 {
	public static final int MAX=10;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] stack = new int[MAX];
		int top=-1;
		
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
					top = push(stack,top);
					break;
				case 2:
					top = pop(stack, top);
					break;
				case 3:
					display(stack, top);
					break;
				default:
					System.out.println("Invalid choice");
			}
			
		}
	}
	
	public static int push(int[] stack, int top) {
		if(top>=(MAX-1))
			System.out.println("Stack Overflow");
		else {
			top+=1;
			System.out.print("Enter an integer: ");
			stack[top]=sc.nextInt();
		}
		
		return top;
	}
	
	public static int pop(int[] stack, int top) {
		if(top==-1)
			System.out.println("Stack Underflow");
		else {
			System.out.println("Item popped: "+stack[top]);
			top-=1;
		}
		
		return top;
	}
	
	public static void display(int[] stack,int top) {
		if(top==-1)
			System.out.println("Stack is Empty");
		else {
			System.out.println("Stack Elements: ");
			int ctr = 0;
			while(ctr<=top) {
				System.out.print(stack[ctr]+" ");
				ctr+=1;
			}
			System.out.println();
		}
	}

}
