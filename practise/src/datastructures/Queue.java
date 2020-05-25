package datastructures;

public class Queue {

	static int capacity;
	static int a[];
	static int front;
	static int rear;
	static int currentsize;
	
	Queue(int size){
		this.capacity=size;
		front=0;
		rear=-1;
		a=new int[this.capacity];
	
	}
	
	
	public static boolean isfull() {
		if(currentsize==capacity) { 
			return true;
			
		}
		
		return false;
	}

	
	public static boolean isempty() {
		if(currentsize==0) {
			return true;
			
		}
		
		return false;
	}

	
	
	//to insert element from queue
	public static void enque(int data) {
		if(isfull()) {
			System.out.println("queue is full");		
		}else {
			rear++;
			if(rear==capacity-1) {
				rear=0;
			}else {
				 a[rear]=data;
				 currentsize++;
				System.out.println("added element is " +data);
			}
			
		}
		
	}
	
	
	
	// to delete element from queue
public  static void dequeue() {
		
	if(isempty()) {
			System.out.println("queue is empty");
		}else {
			front++;
			if(front==capacity-1) {
				System.out.println("removed element is" +a[front-1]); 
			front=0;
			}else {
				System.out.println("removed element is" +a[front-1]);
			}
			
			currentsize--;
			
		}
		
	}
	


	
	public static void main(String[] args) {
		Queue q=new Queue(10);
		enque(3);
		enque(-7);
		enque(0);
		dequeue();
		dequeue();
	 
	}

}
