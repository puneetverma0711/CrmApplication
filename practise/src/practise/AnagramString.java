package practise;

public class AnagramString {

	public static void main(String[] args) {
		
		
		String firststring="cde";
		String secondstring="abc";
		
		
		int sizeoffirststring=firststring.length();
		System.out.println(sizeoffirststring);
		int sizeofsecondstring=secondstring.length(); 
		System.out.println(sizeofsecondstring);
		int totalsize=sizeoffirststring+sizeofsecondstring;
		System.out.println(totalsize);
		
 		
	     String result="";
		
	     for(int i=0;i<sizeoffirststring;i++) {
	    	 
	    	 for(int j=0;j<sizeofsecondstring;j++) {
	    	 
	    	 if(firststring.charAt(i)==secondstring.charAt(j))
	    	 {
	    		  
	    		 
	    		 result=result+firststring.charAt(i)+secondstring.charAt(i); 
	            		 
	    		 
	    	 }
	    
	    	 }
	     }
	     
	     
		  
		    
		
		int resultsize=result.length();
		System.out.println(resultsize); 
	int noofdeletions=totalsize-resultsize;
		
		System.out.println("minumum no of deletions are: " +noofdeletions);
		
		

	}

}
