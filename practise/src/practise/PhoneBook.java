package practise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashMap<String,String> name2phone = new HashMap<String, String>();

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String name = sc.next();
			String phone = sc.next();

			name2phone.put(name, phone);
		}

		while (sc.hasNext()) {
			String name = sc.next();

			if (name2phone.containsKey(name)) {
				System.out.println(name + "=" + name2phone.get(name));
			} else {
				System.out.println("Not found");
			}
		}

		sc.close();
	
	
		/*
		 * 
		 * Scanner in = new Scanner(System.in); int n = in.nextInt();
		 * LinkedHashMap<String,Integer> hmap=new LinkedHashMap<String,Integer>();
		 * for(int i = 0; i < n; i++){ String name = in.next(); int phone =
		 * in.nextInt(); hmap.put(name, phone); }
		 * 
		 * 
		 * 
		 * outer:for(String nameid:hmap.keySet()) { String s=in.next();
		 * if(s.equals(nameid)) { System.out.print(nameid+ "=" +hmap.get(nameid));
		 * continue outer; }
		 * 
		 * System.out.println(); System.out.println("Not found"); } in.close();
		 */
		
		
		
		
		
	
	}

}
