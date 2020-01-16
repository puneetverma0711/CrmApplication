package practise;

import java.util.ArrayList;

public class DupliItem {

	
	
	public static void main(String[] args) {
		
		int a[]= {1,7,3,5,4,6,2,6};
		
		ArrayList<Integer> st=new ArrayList<Integer>();
		
	
for(int i=0;i<a.length;i++){

if(!st.contains(a[i])) {
st.add(a[i]); 
}else {
	continue;
	
}
	
}
System.out.println(st.size());  



}

	}

	
	

