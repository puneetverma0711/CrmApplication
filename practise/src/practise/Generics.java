package practise;

public class Generics<T extends Number> {

	T val;
	T fval;
	
	Generics(T val,T fval){
		this.val=val;
		this.fval=fval;
		
	}
	
	public void shownum() {
		System.out.println(val.getClass().getName());
		System.out.println(fval.getClass().getName());
	}
	
	
	
	
	
	public static void main(String[] args) {
		Generics<Number> g=new Generics<Number>(10,4f);
		g.shownum();
	}

}
