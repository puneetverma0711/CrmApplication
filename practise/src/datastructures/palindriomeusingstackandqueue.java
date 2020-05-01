package datastructures;

import java.util.Scanner;

public class palindriomeusingstackandqueue {

	static int size=80;
	static char stackarr[]=new char[size];	 
	static int top=-1;
    
	static int capacity=80;
	static char queuearr[]=new char[capacity];
	static int currentsize;
	static int front=0;
	static int rear=-1;
	
	
	

	
	
	public  void pushCharacter(char stackchar) {
		if(!this.isfull()) {
			top++; 
			stackarr[top]=stackchar;
			System.out.println(stackarr[top]); 

		}
			
	}
	
	
	
	
	
public  char popCharacter() {
	if(!isempty()) {
		int returnedtop=top;
		top--;
		//System.out.println(+stackarr[returnedtop]); 
		return stackarr[returnedtop];
		
	}else {
		return 0;	
	}
	
	
}

	

public  boolean isfull() {
	return (size-1==top);
	
}


public  boolean isempty() {
	return (top==-1);
	
}
	
	
	
public  void enqueueCharacter(char queuechar) {
		if(!isqueuefull()) {
			rear++;
			if(rear==capacity-1) {
				rear=0;
			}else {
				 queuearr[rear]=queuechar;  
				 currentsize++;
			}
			
		}
		
		
		
	}
	
	
	


public  char dequeueCharacter() {
	if(!isqueueempty()) {
		front++;
		if(front==capacity-1) {
		front=0;
		}else {
			return queuearr[front-1];
			
		}
		
		currentsize--;

	}
		
		return 0;	
	
}




public static boolean isqueuefull() {
	if(currentsize==capacity) { 
		return true;
		
	}
	
	return false;
}


public static boolean isqueueempty() {
	if(currentsize==0) {
		return true;
		
	}
	
	return false;
}




	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        palindriomeusingstackandqueue p = new palindriomeusingstackandqueue();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " + ( (!isPalindrome) ? "not a palindrome." : "a palindrome."));

	}

}
