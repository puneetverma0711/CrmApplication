package codewithdeepunderstandingandplayaround;

public class Error10 {

	public static void main(String[] a) {
		a=new String[5];
		
		for(int i=0;i<a.length;i++) {
			a[i]=String.valueOf(i);
			System.out.println(a[i]);  
			
			
		}
		

	}

}
// String[] args is basically a command line arguments which we pass through command line 
// like after compilation of class file when we write java erro10 "abc" then this will print 
// our argument value without actually printing any value within the main method
// we can pass argument from command line java erro10 puneet kumar with a[0] it will print puneet only
// using loop we can print any no of arguments  

