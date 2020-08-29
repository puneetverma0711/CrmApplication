package practise;

public class ArrayOrderVerify {
 
	public static boolean verifyorder(int[] arr) {
		boolean result=false;
		  
		for (int i = 0; i < arr.length-1; i++) {
			
			if(arr[i]<arr[i+1]) {
				result=true;  
			}else {
				result=false;
				break;
				
			}
		}
		
		return result;
	}

	
	public static void main(String[] args) {
	
		int arr[]= {1,2,3,4,5};
		System.out.println(verifyorder(arr));     
		
		
	}

	
}
