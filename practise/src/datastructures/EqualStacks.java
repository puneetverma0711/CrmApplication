package datastructures;

import java.util.Scanner;
import java.util.Stack;

public class EqualStacks {

   
	private static final Scanner scanner = new Scanner(System.in);
	 
	
	public static Stack<Integer> addarraytostack(int[] a) {
		int sum=0;
		Stack<Integer> s=new Stack<Integer>();
		for(int i=a.length-1;i>=0;i--) {
			sum=sum+ a[i];
			s.push(sum);
	      } 

		return s;
	}
	
	
	public static int stackelementssum(Stack<Integer> s) {
		
		int sum=0;
		for(int i=0;i<s.size();i++) {
			if(!s.isEmpty())  
			sum=sum+s.get(i);
			
		}
		
		return sum;
		
	}
	 
	static int equalStacks(int[] h1, int[] h2, int[] h3) {
       int max_height=0;

       Stack<Integer> s1=addarraytostack(h1);  
       Stack<Integer> s2=addarraytostack(h2);  
       Stack<Integer> s3=addarraytostack(h3);
       
       int sumofelementsofstackone=stackelementssum(s1);
       int sumofelementsofstacktwo=stackelementssum(s2);
       int sumofelementsofstackthree=stackelementssum(s3);
       
      
       
		
		  
		  
		  if(s1.isEmpty() || s2.isEmpty() || s3.isEmpty()) { 
			  return max_height;
		  
		  }
		    
		    
		  outer:while(sumofelementsofstackone!=sumofelementsofstackthree & sumofelementsofstacktwo!=sumofelementsofstackthree) {
		  
		  if(sumofelementsofstackone>sumofelementsofstacktwo && sumofelementsofstackone>sumofelementsofstackthree) 
		  {
			  s1.pop();
		  sumofelementsofstackone=stackelementssum(s1);
		  continue outer;
		  }
		  if(sumofelementsofstacktwo>sumofelementsofstackone && sumofelementsofstacktwo>sumofelementsofstackthree)
		  {
			  s2.pop();
		  sumofelementsofstacktwo=stackelementssum(s2);
		  continue outer;
		  }
		  if(sumofelementsofstackthree>sumofelementsofstackone && sumofelementsofstackthree>sumofelementsofstacktwo) 
		  {
			  s3.pop();
		  sumofelementsofstackthree=stackelementssum(s3);
		  continue outer;
		  
		  }
		  }
		  
		  max_height=stackelementssum(s1);
		 
		
        return max_height;
    }

  
	
	
	
	public static void main(String[] args) {
		 String[] n1N2N3 = scanner.nextLine().split(" ");

	        int n1 = Integer.parseInt(n1N2N3[0].trim());

	        int n2 = Integer.parseInt(n1N2N3[1].trim());

	        int n3 = Integer.parseInt(n1N2N3[2].trim());

	        int[] h1 = new int[n1];

	        String[] h1Items = scanner.nextLine().split(" ");

	        for (int h1Itr = 0; h1Itr < n1; h1Itr++) {
	            int h1Item = Integer.parseInt(h1Items[h1Itr].trim());
	            h1[h1Itr] = h1Item;
	        }

	        int[] h2 = new int[n2];

	        String[] h2Items = scanner.nextLine().split(" ");

	        for (int h2Itr = 0; h2Itr < n2; h2Itr++) {
	            int h2Item = Integer.parseInt(h2Items[h2Itr].trim());
	            h2[h2Itr] = h2Item;
	        }

	        int[] h3 = new int[n3];

	        String[] h3Items = scanner.nextLine().split(" ");

	        for (int h3Itr = 0; h3Itr < n3; h3Itr++) {
	            int h3Item = Integer.parseInt(h3Items[h3Itr].trim());
	            h3[h3Itr] = h3Item;
	        }

	        int result = equalStacks(h1, h2, h3);
          System.out.println(result);
	}

}
