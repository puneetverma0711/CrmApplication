package practise;

import java.util.Hashtable;
import java.util.Map.Entry;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Equal {

	public static int getMaxValue(int[] a) {
		int max_ele=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>max_ele) {
				max_ele=a[i];			
			}
	
		}   
		return max_ele;
	}

	
	
	
	
	
	public static void main(String[] args) {
	int a[]= {10,7,12};
	
	getMaxValue(a);
     
	
	

	}

	
	
	
	
	
	
}
