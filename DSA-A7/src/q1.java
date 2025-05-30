import java .util.Scanner;

public class q1 {
	public static final int MAX=4;
	static Scanner sc = new Scanner(System.in);
	static int rear = -1, front = -1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] queue = new int[MAX];
		
		while(true) {
			System.out.println("*** QUEUE MENU ***");
			System.out.println("0. EXIT");
			System.out.println("1. ENQUEUE");
			System.out.println("2. DEQUEUE");
			System.out.println("3. DISPLAY");
			System.out.print("\nENTER CHOICE: ");
			int choice = sc.nextInt();
			switch(choice) {
				case 0:
					System.out.println("Exiting...");
					System.exit(0);
				case 1:
					rear = enqueue(queue,rear,front);
					break;
				case 2:
					front = dequeue(queue,rear,front);
					break;
				case 3:
					display(queue, rear, front);
					break;
				default:
					System.out.println("Invalid choice");
			}
			
		}
	}
	
	public static int enqueue(int[] queue, int rear, int front) {
		if(rear>=(MAX-1))
			System.out.println("Queue is full");
		else if(rear==-1 && front==-1) {
			rear=front=0;
			System.out.print("Enter an integer: ");
			queue[rear]=sc.nextInt();
		}
		else {
			rear+=1;
			System.out.print("Enter an integer: ");
			queue[rear]=sc.nextInt();
		}
		
		return rear;
	}
	
	public static int dequeue(int[] queue, int rear, int front) {
		if(front==-1)
			System.out.println("Queue is empty");
		else if(front==rear && front>0) {
			System.out.println("Single element in Queue");
			System.out.println("Deleted item: "+queue[front]);
			front=rear=-1;
		}
		else {
			System.out.println("Deleted item: "+queue[front]);
			front+=1;
		}
		
		return front;
	}
	
	public static void display(int[] queue, int rear, int front) {
		if(rear==-1)
			System.out.println("Queue is Empty");
		else {
			System.out.println("Queue Elements: ");
			while(front<=rear) {
				System.out.print(queue[front]+" ");
				front++;
			}
		}
	}

}
