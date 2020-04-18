import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		
		
		Scanner scr=new Scanner(System.in);
		
		
		System.out.println("enter first no");
		int a=scr.nextInt();
		
		
		
		System.out.println("enter second no");
		int b=scr.nextInt();
		
		System.out.println("enter operator");
		String operator=scr.next();
		
		

		int result;
		
		switch(operator) {
		
case "+":    result=a+b;
	System.out.println("addition of given two numbers is: " +result);
break;
		case "-":  result=a-b;
		System.out.println("subtraction of given two numbers is: " +result);
		break;
		
		case "*":  result=a*b;
		System.out.println("multiplication of given two numbers is: " +result);
		break;
		
		case "/":  
			try {
			result=a/b;
		System.out.println("division of given two numbers is: " +result);
		
			}catch(ArithmeticException e) {
				System.out.println("division of given numbers cannot happen by number having 0 value" +e); 
				
			}
		
			break;
		default: System.out.println("invalid operator provided, please provide valid operator to perform operations");
		          break;
		
		}
		
		
		
		
		

	}

}
