package practise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
      //  Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

     
        List<Player> li=Arrays.asList(player);
       
        Collections.sort(li);
        for(Player p:li) {
        	System.out.println(p.name+ " "+p.score); 

        }
		

	}

}



