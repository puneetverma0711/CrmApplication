package practise;

public class Splittest {

	public static void main(String[] args) {
		String price="Rs.4319";
		String c[]=price.split("[^\\w]");    
		System.out.println(c[1]);  
		

	}

}
