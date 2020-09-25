package codewithdeepunderstandingandplayaround;

import java.util.List;

public interface testinterface {

	static class a {
		// we can have the local inner class as static in interface as well as abstract
		
	}
	
/* static  {
		
		here in interface we cannot declare static block
	} */
	
	// cannot use private modifier
	 int val=10;
	//here with only method prototype we cannot use static
	// also we cannot use final keyword for method here
	 public  void abc() ;
	List<String> dostuff(List<String> s);  
	// public void ghj() {} this will not compile as we need to define static here for method 
	 //with body in interface
	 
	
	// static can be used only for method with body
	public static  void vbn() {
		
		
	}
	
}
