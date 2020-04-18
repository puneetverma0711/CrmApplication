package practise;

public class SmallestNumInArray {

	public static void main(String[] args) {
		
		
		int a[]= {5,8,14,16,40};

		int min=0;
		boolean flag=false;
		outer:for(int i=0;i<a.length;i++) {
			min=a[i];
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<min)
				{
					min=a[j];
					flag=true;
	               
				}

			}
			
			if(flag==false || flag==true) {
				
				break outer;
			}
			
				
				
			
			
		}
		
		
		
System.out.println(min);  		

	}

}
