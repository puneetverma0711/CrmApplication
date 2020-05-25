package codewitherrors;

public class Error7 {

	public static void main(String[] args) {
		byte b=4;
		int i=b;
		int val=5;
//		byte n=i; //compiler error
		byte c=(byte) i; // no error
		System.out.println(i);
		System.out.println(c);
		
		float f=56;
		double d=f; 
		//error long l=f; 
 		long l=(long)f;
		System.out.println(d +" " +l );

	}

}
