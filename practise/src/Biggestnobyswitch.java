import java.util.Scanner;

public class Biggestnobyswitch {

	public static void main(String[] args) {
		
		
		
		Scanner scr=new Scanner(System.in);
		
		
		System.out.println("enter first no");
		int a=scr.nextInt();
		
		
		
		System.out.println("enter second no");
		int b=scr.nextInt();
		
System.out.println("enter third no");
int c=scr.nextInt();
		
		System.out.println("what do you want to know between the given numbers");
		String option=scr.next();
		
		

		
		
		switch(option) {
		
case "greatest":    
	
	if(a>b && a>c) {
		
		System.out.println("first number is greatest: " +a);
	}  else if(b>c){
		System.out.println("second number is greatest: " +b);
		
		
	}else {
		
		System.out.println("third number is greatest: " +c);
	}
	
	
	
break;
		case "lowest": 

			if(a<b && a<c) {
				
				System.out.println("first number is lowest: " +a);
			}  else if(b<c){
				System.out.println("second number is lowest: " +b);
				
				
			}else {
				
				System.out.println("third number is lowest: " +c);
			}
			
			
		break;
		
		
		default: System.out.println("not a valid option");
		          break;
		
		}
		
		
		
		
		

	}

}
