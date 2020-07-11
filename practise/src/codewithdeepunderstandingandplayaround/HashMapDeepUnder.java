package codewithdeepunderstandingandplayaround;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class HashMapDeepUnder {

	public static void main(String[] args) {
		List<Integer> phonenumberlist=new ArrayList<Integer>();
		phonenumberlist.add(100);
		phonenumberlist.add(200);
		
		List<Integer> faxnumberlist=new ArrayList<Integer>();
		faxnumberlist.add(500);
		faxnumberlist.add(700);
		
		Map<Integer,List<Integer>> phonebook=new HashMap<Integer,List<Integer>>();
		phonebook.put(1,phonenumberlist);
		phonebook.put(2,faxnumberlist);
		//{puneet=[45345354355, 564545545, 564545545, 9988988666, 4456788989]}
		//here key can have multiple value in hashmap
		//here key can have duplicate value in hashmap both will happen using list
	
     System.out.println(phonebook.get(1));
    
     
     Map<String,String> phonebk=new HashMap<String,String>();
     phonebk.put("amit", "988655544");
     phonebk.put("sahil", "8865656");
     phonebk.put("dharm", null);
     phonebk.put("amit", null);
     phonebk.put(null, "668787878");
     
     //{null=668787878, dharm=null, amit=null, sahil=8865656}  
     // here hashmap can contain only one null key and multiple null value
     
     System.out.println(phonebk.toString());
     
     
     
     Map<String,String> phnbk=new Hashtable<String,String>();
     phnbk.put("amit", "988655544");
     phnbk.put("sahil", "8865656");
     phnbk.put("dharm", "8878645");
     phnbk.put("amit", "34343434");
    
     // phnbk.put(null, null);  this will give null pointer exception if we try to 
    // insert null in key or values
     
     System.out.println(phnbk.toString());
     
     
     
     
     
     
	}

}
