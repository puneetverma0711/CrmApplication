package practise;

import java.util.Scanner;

public class CatsMouse {
	 static String output;
	
	static String catAndMouse(int x, int y, int z) {
          
           
           int dist_from_catA=Math.abs(x-z);
           int dist_from_catB=Math.abs(y-z);
           
           if(dist_from_catB<dist_from_catA) {
        	   
        	   return  output="Cat B";
           }else if(dist_from_catB>dist_from_catA) {
        	   return  output="Cat A";
        	   
           }else {
        	   return  output="Mouse C"; 
        	   
           }
           

    }

    private static final Scanner scanner = new Scanner(System.in);


	public static void main(String[] args) {
		int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0]);

            int y = Integer.parseInt(xyz[1]);

            int z = Integer.parseInt(xyz[2]);

            String result = catAndMouse(x, y, z);
   System.out.println(result);   

	}
        
	}
}
