package practise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MarcCalorieCount {

	static long marcsCakewalk(int[] calorie) {
		long miles=0;

		
		  List<Integer> calorielist=Arrays.stream(calorie).boxed().collect(Collectors.toList());
		  Collections.sort(calorielist, new Comparator<Integer>() {
		  
			  @Override
				public  int compare(Integer o1, Integer o2) {
					// TODO Auto-generated method stub
					return o2.compareTo(o1);  
				}  
		 
		  });
		  
		 
		for(int i=0;i<calorielist.size();i++) {
			
			miles=(long) (miles+calorielist.get(i)*Math.pow(2, i));
			
			
		}
		  
		  
		
		
		return miles;
    }
	
	
	
	
	
	
	public static void main(String[] args) {
		
		//System.out.println(Math.pow(2, 3));
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] calorie = new int[n];

        String[] calorieItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int calorieItem = Integer.parseInt(calorieItems[i]);
            calorie[i] = calorieItem;
        }

        long result = marcsCakewalk(calorie);
        System.out.println(result);

        scanner.close();
		
		
		
	}




	

}
