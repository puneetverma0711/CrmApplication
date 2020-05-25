package datastructures;

import java.io.*;
import java.util.*;

 class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

class LinkedList {

    public static  Node insert(Node head,int data) {
        Node node=new Node(data);

            if(head==null){
            
            	head=node;

            }else{
                   Node n=head;  
                   while(n.next!=null){
                         n=n.next;
                   }
                    n.next=node;  
                    return head;
            }
			
            
           return node;

                        
           


    }

    public static  Node delete(Node head,int data) {
    	
    	Node p,q;
		q=head;
		p=head.next;
    			
    	
    		
    		if(q.data==data) {
   				head=p;
			}else {
			while(p.data!=data) {
				p=p.next;
				q=q.next;
			}
			
			if(p.next==null) {
				q.next=null;

			}else {
				q.next=p.next;
				
			}
			
			}

		    	return head;

    }
    

    
    public static  Node removeduplicate(Node head) {
    	Node p=head;
    	Node q;
    	
    	while(p!=null && p.next!=null) {
    		
    		if(p.data==p.next.data) {
    			q=p.next.next;
    			if(q==null) {
    				p.next=null;
    				break;
    			}
    			
    			p.next=q;
    		}
    			if(p.data!=p.next.data) {
    				p=p.next;
    			}
  
    		
  //end of all if's  		
    		
    	}
    	
    	
    	
    	return head;

    }

    
    
    
    
    
	public static void display(Node head) {
        Node start = head;
        while(start.next != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
       System.out.println(start.data);
  	    
	}

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head=insert(head,ele);
       
        }
        System.out.println("--------original linked list data---------");
        display(head);
    head=delete(head,5);
    System.out.println("--------linked list data with deleted node---------");  
    display(head);
       head=removeduplicate(head);
       System.out.println("--------linked list with removed duplicates---------");
       display(head);
        sc.close();    
    }
}
