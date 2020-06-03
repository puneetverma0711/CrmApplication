package codewithdeepunderstandingandplayaround;

public class Errro9 {

	/* public final synchronized strictfp static void main(String... ss) {
	
		System.out.println("test");
	
		valid main method
		
	}  */
	
	
public static void main(String[] bb) {
		
		System.out.println("test 1");
		
	}
//overload main method	
	public static void main(int[] sb) {
		
		System.out.println("test 2");
		
	}

	//main method should have static keyword without static main will not be loaded into the 
	//memory because it will non static and we don't have any object for that
	
	// main method should have void only as return type , for other data type it does not work 
	
	//yes we can change public to any other access specifier , but at runtime exception 
	//will be thrown by jvm
	// yes we can overload the main method , with different arguments but runtime exception will 
	// thrown
	// no we can't change the return time compile time error will be thrown
	// we can change the main method name to puneetmain but we have to customize the internal 
	//implementation of the jvm main method which it need to call as well, runtime exception will be 
	//thrown i.e no such method error: main
	// yes we  can pass String instead of String[] but runtime exception will be thrown
	
	//we cannot use default specifier, we have use only public specifier
	
	
	
	// only change we can do from the general main protoype is String[] a --> here we won't get
		//any runtime exception code will complie and excute properly
	//we can change the order of static public 
	
	
	
}
