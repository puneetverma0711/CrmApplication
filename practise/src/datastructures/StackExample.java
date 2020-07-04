package datastructures;

public class StackExample {

	int a[];
	int size;
	int top;
	
	StackExample(int size){
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
	 * public int peek() {   // this peek operation will return you the top element from the stack
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

public static int stackelementssum(StackExample s) {
	
	int sum=0;
	for(int i=0;i<s.size;i++) {
		if(!s.isempty())
		sum=sum+s.pop();
		
	}
	
	return sum;
	
}



	
	public static void main(String[] args) {
		StackExample s=new StackExample(5);
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println("current sum of stack elements is: "+stackelementssum(s));  
		s.push(40);
		s.push(50);
		System.out.println("current sum of stack elements is: "+stackelementssum(s));  
	}

}
