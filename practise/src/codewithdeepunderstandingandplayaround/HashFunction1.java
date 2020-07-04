package codewithdeepunderstandingandplayaround;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashFunction1 {
	//static int a[];
	//int size;
	
	/*
	 * HashFunction1(int size){ this.size=size; a=new int[this.size];
	 * 
	 * }
	 */
	
	// open addressing linear probing       
	public static Hashtable<Integer,Integer> hash(int ar[],int n) {
	 Hashtable<Integer,Integer> htable=new Hashtable<Integer,Integer>(n);
	
	 for(int i=0;i<ar.length;i++) {
		 
		 if(htable.get(ar[i] % n)==null) {
			 htable.put((ar[i] % n), ar[i]);
			 
		 }else {
			 int val=1;
			 while(htable.get((ar[i]+val) % n)!=null) {   
			   val++;  
				 
			 }
			 htable.put(((ar[i]+val) % n), ar[i]);  
		 }
		 
		 
		 }
		 
		 return htable;
	 }
	 
	 
	 
	 
	
	
	
	
	
	public static void main(String[] args) {
		//HashFunction1 hf=new HashFunction1(10);
		int a[]= {100,90,90,80,75,60}; 
		int length=a.length;
		

		Hashtable<Integer,Integer> outputtable= hash(a,length); 

		for(Entry<Integer,Integer> data: outputtable.entrySet()) {
			System.out.print("|");
			System.out.print(data.getKey() + " = "  +data.getValue());       
			System.out.print("|");
		}
		
		 
		
		
		
	}

}
