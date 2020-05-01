package datastructures;

public class Stack {

	int a[];
	int size;
	int top;
	
	Stack(int size){
		this.size=size;
		a=new int[this.size];
		this.top=-1;
		
		
	}
	
	public boolean isfull() {
		return (size-1==top);
	}
	
public boolean isempty() {
		return (top==-1);
	}
	
	
	
	/*
	 * public int peek() {
	 * 
	 * if(!this.isfull()) { return a[top];
	 * 
	 * }else {
	 * 
	 * System.out.println("stack is full"); return -1; }
	 * 
	 * }
	 */



public int pop() {
	
	if(!isempty()) {
		int returnedtop=top;
		top--;
		System.out.println("popped element is: "  +a[returnedtop]);
		return a[returnedtop];
	}else {
		
		System.out.println("stack is empty");  
		return -1;
	}
	
	
	
}




public void push(int data) {
	
	if(!this.isfull()) {
		top++;
		a[top]=data;
		System.out.println("added element is: "  +data);
		
	}else {
		
		System.out.println("stack is full");
		
	}
	
}





	
	public static void main(String[] args) {
		Stack s=new Stack(5);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.pop();
		s.pop();
		s.pop();

	}

}
