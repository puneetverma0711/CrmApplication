

 class Node1 {

	int data;
	Node1 next;
	
}


 
 
class LinkedList {

Node1 head;
	
	
	public void insert(int data) {
		Node1 node=new Node1();
		node.data=data;
		node.next=null;
		
		
		if(head==null) {
			
			head=node;
			
		}else {
		
			Node1 n=head;
		
		while(n.next!=null) {
			
			n=n.next;
			
		}
		
		n.next=node;
		}
		
	}

	
	public void show() {
		Node1 n=head;
		
		while(n.next!=null) {
			System.out.println(n.data);
			n=n.next;
		}
		System.out.println(n.data);  
	}
	
	
	

 }

 
 public class Solution14 {

	public static void main(String[] args) {
		LinkedList ll= new LinkedList();
		ll.insert(45);
		ll.insert(80);
		ll.insert(100);
		ll.insert(140);
		ll.show();
	}

}
  



