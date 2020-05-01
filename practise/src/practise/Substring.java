package practise;

public class Substring {

	public static void main(String[] args) {
		String s1="hi";
		String s2="world";
		String output="NO";
		
	
	       
          outer: for(char c : "abcdefghijklmnopqrstuvwxyz".toCharArray())

           {
                   if(s1.indexOf(c) > -1 && s2.indexOf(c) > -1)
                   {
                	   output = "YES";
                	   break outer;
                   }
                   
               }

           
         
           System.out.println(output);  
	
	}

}
