package practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortaraylistusingcomparater {

	public static void main(String[] args) {
		List<Integer> li=new ArrayList<Integer>();
		li.add(4);
		li.add(20);
		li.add(10);
		li.add(8);
		li.add(18);
		li.add(15);
		
		System.out.println(li);
		Collections.sort(li);  // to sort elements in ascending order
		System.out.println(li); 
		Collections.sort(li, new SortComparater());  // to sort elements in descending  order
		System.out.println(li);
		
		

	}

}
