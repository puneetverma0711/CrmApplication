package datastructures;

public class Queue {

	int capacity;
	int a[];
	int front;
	int rear;
	int currentsize;
	
	Queue(int size){
		this.capacity=size;
		front=0;
		rear=-1;
		a=new int[this.capacity];
	
	}
	
	
	public boolean isfull() {
		if(currentsize==capacity) { 
			return true;
			
		}
		
		return false;
	}

	
	public boolean isempty() {
		if(currentsize==0) {
			return true;
			
		}
		
		return false;
	}

	
	
	//to insert element from queue
	public void enque(int data) {
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
public void dequeue() {
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
		q.enque(10);
		q.enque(20);
		q.dequeue();
		q.enque(30);
		q.enque(40);
		q.dequeue();
		q.dequeue();
		q.enque(50);
		q.dequeue();
		q.enque(60);
		q.dequeue();
	}

}
