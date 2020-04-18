package practise;

public class OperatorProg {

	public static void main(String[] args) {
		
		double mealcost=12.00;
		int tippercent=20;
		int taxpercent=8;
		
		
		double tip=mealcost *tippercent/100;
		System.out.println(tip);
		
		double tax=mealcost *taxpercent/100;
		System.out.println(tax);
		
		
		double totalcost=mealcost +tip+tax;
		
		
		System.out.println(Math.round(totalcost));
		
		

	}

}
