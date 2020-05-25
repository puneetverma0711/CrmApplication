package practise;

public class singlechararraysortusingbubble {

	public static void main(String[] args) {

	char temp=0;

	char[] d={'e','b','a','c','d'};	
	
	for(int i=0;i<d.length;i++) {
		int flag=0;
		for(int j=0;j<d.length-1;j++) {
		   if(d[j]>d[j+1]) {  
			temp= d[j];    
		   d[j]=d[j+1];
		   d[j+1]=temp;  
		   flag++;
		   }
		   
		   if(flag==0) {
			   break;
			   
		   }
			
		}
	       
	}
	
	for(char v:d) {
		System.out.print(v + " ");
		
	}
	
	
	
	
	
	}

}
