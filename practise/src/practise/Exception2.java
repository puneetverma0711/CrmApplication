package practise;

import java.util.Scanner;

class Calculator{
	
	int power(int num,int pow) throws Exception {
		if(num<0 ||pow<0) {
			throw new Exception("n and p should be non-negative");
			}
		
		int output=0;
		
		try {
			
			output=(int) Math.pow(num, pow);
						
		}catch(Exception np){
			
			System.out.println("n and p should be non-negative");  
			
		}
		return output; 
		
		
	
	}
	
	
}




public class Exception2 {

	public static void main(String[] args) {
		

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
		

	}

}
