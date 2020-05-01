package practise;

public class Test15 {

	static { 
        
        System.out.println("static block called "); 
    } 
	
	static void Test15() {
		System.out.println("test 15 cons with void");
		
	}
	
	
	  Test15(){  
		
		System.out.println("test 15 cons");
	}
	
	public static void main(String[] dude) {
		Test15();
		Test15 d= new Test15();
		d.Test15();
		

	}

	
	
	
	
	
}
