package codewitherrors;

public class Error4 {

	public static void main(String args[]) {
		boolean b=false;
		Double d1 = 0.5d;
        Double d2 = null;
        Double result = b ? d1.doubleValue() : d2;  //java.lang.NullPointerException will be 
        //thrown due to auto unboxing
 
        System.out.println(result);
		
	}
}
