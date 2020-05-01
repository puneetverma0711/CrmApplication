package practise;

public class ConstructorEx {

	int i;
	String name;
	
	public  ConstructorEx(){
System.out.println("default constructor");	 	
	}
	
	public ConstructorEx(int i,String name) {
		this.i=i;
		this.name=name;
		System.out.println("2 param cons");
		
		
	}
	
	
	public ConstructorEx(int i) {
		
		System.out.println("2 param cons"+i);
		
		
	}
	
	
	public static void main(String[] args) {
	
		ConstructorEx c1=new ConstructorEx();
		ConstructorEx c2=new ConstructorEx(1,"puneet");
		System.out.println(c2.i);
		System.out.println(c2.name);
		byte b=10;
		ConstructorEx c3=new ConstructorEx(b); //byte is allowed as it is small datatype then int get type casted 
		//automatically
	}

}
