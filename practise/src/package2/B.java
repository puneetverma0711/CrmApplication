package package2;
import package1.*;
public class B extends A {

	 public void addchar() {
		 System.out.println("child add char");
		 
		 
	 }
	
	public static void main(String args[]) 
	   {   
	       B obj = new B();   
	       obj.a=12;
	       obj.display(); 
	       
	       A obj2= new B();
	       obj2.addchar();
	       
	       
	   }   
	
}
