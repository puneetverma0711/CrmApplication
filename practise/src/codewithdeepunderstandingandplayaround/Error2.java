package codewithdeepunderstandingandplayaround;

public class Error2 {

	public static void main(String[] args) {
		 int i = 2;
		 double j=4; // double can't be used here switch works with int and string only
		 
	        switch (i) {
	            case 1: System.out.println("First class");
	            break;
	            case 2: System.out.println("Second class");
	                break;
	            default:
	                break;
	        }

	}

}
